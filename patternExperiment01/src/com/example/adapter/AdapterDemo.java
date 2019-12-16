package com.example.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Moblie moblie = new Moblie();
        MicroUSB microUSB = new MicroUSB();
        TypeC_USB typeC_usb = new MicroToTypeCAdapter(microUSB);
        moblie.batteryCharge(typeC_usb);
    }
}
