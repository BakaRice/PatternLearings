package com.example.Factory;

import com.example.Builder0.entity.*;

public class ProMoblieFactory implements MoblieFactory {
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
        return battery;

    }


    public FingerPrint createfingerPrint() {
        FingerPrint fingerPrint = new FingerPrint();
        return fingerPrint;
    }


    public Gps creategps() {
        Gps gps = new Gps();
        return gps;
    }


    public Camera createCrmera() {
        Camera camera = new Camera();
        return camera;
    }
}
