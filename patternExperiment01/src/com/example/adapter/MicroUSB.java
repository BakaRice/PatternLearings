package com.example.adapter;

public class MicroUSB implements Micro{
    public String getName() {
        return "MicroUSB";
    }
    //定义micro电压为15v
    public Integer getVoltage() {
        return 15;
    }
}
