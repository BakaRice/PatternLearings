package com.example.adapter;

public class MicroToTypeCAdapter extends TypeC_USB implements TypeC  {
    private MicroUSB microUSB;

    public MicroToTypeCAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;

    }

    @Override
    public String getName() {
        return "转接头 ==> "+microUSB.getName();
    }

    @Override
    public Integer getVoltage() {
        System.out.println("转接头：原始电压:==>"+microUSB.getVoltage());
        System.out.println("转接头:电压转换:"+microUSB.getVoltage()+"==>5");
        return 5;
    }
}
