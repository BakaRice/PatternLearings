package com.example.adapter;

public class Moblie {
    /*充电*/
    public void batteryCharge(TypeC_USB typeC_usb) {
        System.out.println("手机:连接接口:==>" + typeC_usb.getName());
        System.out.println("手机:连接电压:==>" + typeC_usb.getVoltage());
    }
}
