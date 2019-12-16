package com.example.Factory;

import com.example.Builder0.Moblie;

public class ProPipeLine extends PipeLine {

    ProMoblieFactory factory;

    public ProPipeLine(ProMoblieFactory factory) {
        this.factory = factory;
    }


    protected void prepare() {

        cpu = factory.createCPU();
        ram = factory.createRam();
        screen = factory.creteScreen();
        battery = factory.createBattery();
        camera = factory.createCrmera();
        fingerPrint = factory.createfingerPrint();

    }

    protected Moblie getMoblie() {
        Moblie ProMoblie = new Moblie.Builder(cpu, battery, screen, ram)
                .cremra(camera)
                .fingerPrint(fingerPrint)
                .build();
        return ProMoblie;
    }
}
