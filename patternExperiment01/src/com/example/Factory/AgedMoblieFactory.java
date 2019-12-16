package com.example.Factory;

import com.example.Builder0.Moblie;
import com.example.Builder0.entity.Battery;
import com.example.Builder0.entity.CentralProcessingUnit;
import com.example.Builder0.entity.Ram;
import com.example.Builder0.entity.Screen;

public class AgedMoblieFactory implements MoblieFactory{


    @Override
    public CentralProcessingUnit createCPU() {
        CentralProcessingUnit cpu = new CentralProcessingUnit();
        return cpu;
    }

    @Override
    public Screen creteScreen() {
        Screen screen = new Screen();
        return screen;
    }

    @Override
    public Ram createRam() {
        Ram ram = new Ram();
        return ram;
    }

    @Override
    public Battery createBattery() {
        Battery battery = new Battery();
        return  battery;

    }


}
