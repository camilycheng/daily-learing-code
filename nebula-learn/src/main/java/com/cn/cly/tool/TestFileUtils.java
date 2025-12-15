package com.cn.cly.tool;

import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: zlf
 * @Date: 2023/2/17 15:37
 */
public class TestFileUtils {

    public static String readFile(String path) throws IOException {
        StringBuilder file = new StringBuilder();
        // 使用一个字符串集合来存储文本中的路径 ，也可用String []数组
        FileInputStream fis = new FileInputStream(path);
        // 防止路径乱码 如果utf-8 乱码 改GBK
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            file.append(line);
        }
        br.close();
        isr.close();
        fis.close();
        return file.toString();
    }

    public static List<String> readFileList(String path) throws IOException {
        List<String> list = new ArrayList<>();
        StringBuilder file;
        // 使用一个字符串集合来存储文本中的路径 ，也可用String []数组
        FileInputStream fis = new FileInputStream(path);
        // 防止路径乱码 如果utf-8 乱码 改GBK
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            file = new StringBuilder();
            file.append(line);
            list.add(file.toString());
        }
        br.close();
        isr.close();
        fis.close();
        return list;
    }

    public static String getFormat2Num(Double d) {
        if (d != null) {
            DecimalFormat df2 = new DecimalFormat("0.00");
            String formatted = df2.format(d);
            return formatted;
        }
        return null;
    }

    static boolean checkParamsIsNotAllNull(String... params) {
        List<String> list = Arrays.asList(params);
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String ele = iter.next();
            if (ele != null && !ele.isEmpty() && new BigDecimal(ele).compareTo(BigDecimal.ZERO) != 0) {
                return true;
            }

        }
        return false;
    }

    static boolean checkParamsIsAllNull(String... params) {
        List<String> list = Arrays.asList(params);
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String ele = iter.next();
//            System.err.println(new BigDecimal(ele).compareTo(BigDecimal.ZERO));
//            System.err.println(new BigDecimal(ele));
//            System.err.println(StringUtils.isNotBlank(ele));
//            System.err.println(new BigDecimal(ele).compareTo(BigDecimal.ZERO)==0);

            if (StringUtils.isNotBlank(ele)&&new BigDecimal(ele).compareTo(BigDecimal.ZERO)!=0) {
                return false;
            }



        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.err.println(checkParamsIsAllNull("0"));
        System.err.println(checkParamsIsAllNull("1", "0", null));
        System.err.println(checkParamsIsAllNull("0", "0", null));
    }
}
