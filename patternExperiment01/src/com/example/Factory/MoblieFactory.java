package com.example.Factory;

import com.example.Builder0.Moblie;
import com.example.Builder0.entity.*;

//手机部件生产
public interface MoblieFactory {
   public CentralProcessingUnit createCPU();

   public Screen creteScreen();

   public Ram createRam();

   public Battery createBattery();
}
