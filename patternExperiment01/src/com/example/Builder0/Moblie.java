package com.example.Builder0;

import com.example.Builder0.entity.*;

public class Moblie {
    //必选项
    private CentralProcessingUnit centralProcessingUnit;
    private Battery battery;
    private Screen screen;
    private Ram ram;
    //可选项
    private Camera camera;
    private FingerPrint fingerPrint;
    private Gps gps;
    private Nfc nfc;

    private Moblie(Builder builder) {
        this.centralProcessingUnit = builder.centralProcessingUnit;
        this.battery = builder.battery;
        this.screen = builder.screen;
        this.ram = builder.ram;

        this.camera = builder.camera;
        this.fingerPrint = builder.fingerPrint;
        this.gps = builder.gps;
        this.nfc = builder.nfc;
    }

    public static class Builder {
        //必选项
        private CentralProcessingUnit centralProcessingUnit;
        private Battery battery;
        private Screen screen;
        private Ram ram;
        //可选项
        private Camera camera;
        private FingerPrint fingerPrint;
        private Gps gps;
        private Nfc nfc;

        /*
         * 在手机实体内部定义builder类，
         * 通过构造方法限定死必须使用的手机部件
         * 其余
         * */
        public Builder(CentralProcessingUnit centralProcessingUnit, Battery battery, Screen screen, Ram ram) {
            this.centralProcessingUnit = centralProcessingUnit;
            this.battery = battery;
            this.screen = screen;
            this.ram = ram;
        }

        public Builder cremra(Camera camera) {
            this.camera = camera;
            return this;
        }

        public Builder fingerPrint(FingerPrint fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }

        public Builder gps(Gps gps) {
            this.gps = gps;
            return this;
        }

        public Builder nfc(Nfc nfc) {
            this.nfc = nfc;
            return this;
        }

        public Moblie build() {
            return new Moblie(this);
        }
    }

    public CentralProcessingUnit getCentralProcessingUnit() {
        return centralProcessingUnit;
    }

    public Battery getBattery() {
        return battery;
    }

    public Screen getScreen() {
        return screen;
    }

    public Ram getRam() {
        return ram;
    }

    public Camera getCamera() {
        return camera;
    }

    public FingerPrint getFingerPrint() {
        return fingerPrint;
    }

    public Gps getGps() {
        return gps;
    }

    public Nfc getNfc() {
        return nfc;
    }

}
