package com.example.Builder;

class Mobile {
    //必须部件
    private String CPU;
    private String RAM;
    private String battery;
    private String screen;
    //可选部件
    private String camera;
    private String GPS;
    private String fingerPrint;
    private String NFC;

    //必选
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    //可选
    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public void setNFC(String NFC) {
        this.NFC = NFC;
    }
}
