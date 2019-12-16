package com.example.Builder;
//抽象建造者
public abstract class MobileBuilder {
    //创建产品对象
    protected Mobile  mobile= new Mobile();
    public abstract  void buildCpu();
    public abstract  void buildRAM();
    public abstract  void buildBattery();
    public abstract  void buildScreen();
    public abstract  void buildCamera();
    public abstract  void buildGPS();
    public abstract  void buildFingerPrint();
    public abstract  void buildNFC();
    //返回产品对象
    public Mobile getMobile(){
        return mobile;
    }
    /**
     *      //必须部件
     *     private String CPU;
     *     private String RAM;
     *     private String battery;
     *     private String screen;
     *     //可选部件
     *     private String camera;
     *     private String GPS;
     *     private String fingerPrint;
     *     private String NFC;
     */
}
