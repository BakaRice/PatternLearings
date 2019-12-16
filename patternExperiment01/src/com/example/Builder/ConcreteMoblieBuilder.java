package com.example.Builder;

//具体建造者：实现抽象建造者接口
public class ConcreteMoblieBuilder extends MobileBuilder {
    @Override
    public void buildCpu() {
        mobile.setCPU("建造cpu");
        System.out.print("建造cpu,");
    }

    @Override
    public void buildRAM() {
        mobile.setRAM("建造内存");
        System.out.print("建造内存,");
    }

    @Override
    public void buildBattery() {
        mobile.setBattery("建造电池");
        System.out.print("建造电池,");
    }

    @Override
    public void buildScreen() {
        mobile.setScreen("建造屏幕");
        System.out.print("建造屏幕,");
    }

    @Override
    public void buildCamera() {
        mobile.setCamera("建造相机");
        System.out.print("建造相机,");
    }

    @Override
    public void buildGPS() {
        mobile.setGPS("建造GPS");
        System.out.print("建造GPS,");
    }

    @Override
    public void buildFingerPrint() {
        mobile.setFingerPrint("建造指纹识别");
        System.out.print("建造指纹识别,");
    }

    @Override
    public void buildNFC() {
        mobile.setNFC("建造NFC");
        System.out.print("建造NFC,");
    }
}
