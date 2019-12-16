package com.example.Factory;

import com.example.Builder0.Moblie;
import com.example.Builder0.entity.*;

public abstract class  PipeLine {
    //必选项
    protected CentralProcessingUnit cpu;
    protected Battery battery;
    protected Screen screen;
    protected Ram ram;
    //可选项
    protected Camera camera;
    protected FingerPrint fingerPrint;
    protected Gps gps;
    protected Nfc nfc;

    protected abstract void prepare();

    protected abstract Moblie getMoblie();
}
