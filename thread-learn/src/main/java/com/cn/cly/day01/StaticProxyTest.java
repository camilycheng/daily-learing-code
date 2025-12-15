package com.cn.cly.day01;

/**
 * 静态代理
 */
interface  ClothFactory{
   void createCloth();
}

class ClothProxy implements ClothFactory{
    private  ClothFactory clothFactory;
    public ClothProxy(ClothFactory  clothFactory){
        this.clothFactory = clothFactory;
    }

    @Override
    public void createCloth() {
        System.out.println("代理工厂做一些准备工作");
        clothFactory.createCloth();
        System.out.println("ddd");
    }
}

class NikeClothFactory implements ClothFactory{
    @Override
    public void createCloth() {
        System.out.println("Nike 工厂生产一批运动服");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        NikeClothFactory  nikeClothFactory = new NikeClothFactory();
        ClothFactory  proxyFactory = new ClothProxy(nikeClothFactory);
        proxyFactory.createCloth();
    }
}
