package com.example.Factory;

import com.example.Builder0.Moblie;
import com.example.Builder0.entity.*;

public class AgedPipeLine extends PipeLine{

    MoblieFactory factory;
    public AgedPipeLine(MoblieFactory factory) {
      this.factory = factory;
    }


    protected void prepare() {

        cpu = factory.createCPU();
        ram = factory.createRam();
        screen = factory.creteScreen();
        battery = factory.createBattery();
    }

    protected Moblie getMoblie() {
        Moblie agedMoblie = new Moblie.Builder(cpu,battery,screen,ram).build();
        return agedMoblie;
    }
}
