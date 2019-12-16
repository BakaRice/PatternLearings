package com.example.Builder;

public class MoblieDirector {
    private MobileBuilder mobileBuilder;

    public MoblieDirector(MobileBuilder mobileBuilder) {
        this.mobileBuilder = mobileBuilder;
    }
    //产品构建与组装方法
    public Mobile construct(){
        mobileBuilder.buildCpu();
        mobileBuilder.buildBattery();
        mobileBuilder.buildRAM();
        mobileBuilder.buildGPS();
        return mobileBuilder.getMobile();
    }
    public Mobile construct1(){
        mobileBuilder.buildCpu();
        mobileBuilder.buildBattery();
        mobileBuilder.buildRAM();
        mobileBuilder.buildGPS();
        mobileBuilder.buildCamera();

        return mobileBuilder.getMobile();
    }

    public Mobile construct2(){
        mobileBuilder.buildCpu();
        mobileBuilder.buildBattery();
        mobileBuilder.buildRAM();
        mobileBuilder.buildGPS();
        mobileBuilder.buildCamera();
        mobileBuilder.buildFingerPrint();
        mobileBuilder.buildNFC();
        return mobileBuilder.getMobile();
    }
}
