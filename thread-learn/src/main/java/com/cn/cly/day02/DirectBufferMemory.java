package com.cn.cly.day02;

import com.sun.management.HotSpotDiagnosticMXBean;

import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.nio.ByteBuffer;
import java.util.List;

public class DirectBufferMemory {
    public static void main(String[] args) {
        //NIO 对外内存 jdk 9 之前
       // System.out.println("Hello World"+(sun.misc.VM.maxDirectMemory()/1024/1024));
        //分配系统内存
        ByteBuffer  buffer = ByteBuffer.allocateDirect(1024*1024);//


        // 方法1: 获取最大直接内存（通过系统属性）
        String maxDirectMemory = System.getProperty("sun.nio.MaxDirectMemorySize");
        System.out.println("Max Direct Memory (via property): " + maxDirectMemory);

        // 方法2: 使用 HotSpotDiagnosticMXBean（需要添加JVM参数）
        try {
            HotSpotDiagnosticMXBean bean = ManagementFactory.getPlatformMXBean(HotSpotDiagnosticMXBean.class);
            String vmOption = bean.getVMOption("MaxDirectMemorySize").getValue();
            System.out.println("Max Direct Memory (via HotSpot): " + vmOption);
        } catch (Exception e) {
            System.out.println("Cannot get MaxDirectMemorySize via HotSpotDiagnosticMXBean: " + e.getMessage());
        }

        // 方法3: 监控当前直接内存使用情况
        List<BufferPoolMXBean> pools = ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class);
        for (BufferPoolMXBean pool : pools) {
            if (pool.getName().equals("direct")) {
                System.out.println("Direct buffer pool:");
                System.out.println("  Count: " + pool.getCount());
                System.out.println("  Total capacity: " + pool.getTotalCapacity());
                System.out.println("  Memory used: " + pool.getMemoryUsed());
            }
        }
    }
}
