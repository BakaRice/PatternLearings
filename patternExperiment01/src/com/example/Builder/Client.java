package com.example.Builder;


public class Client {
    public static void main(String[] args) {
        MobileBuilder mobileBuilder = new ConcreteMoblieBuilder();
        MoblieDirector moblieDirector = new MoblieDirector(mobileBuilder);
        System.out.println("\n老人机：");
        Mobile mobile = moblieDirector.construct();
        System.out.println("\n摄影爱好者:");
        Mobile mobile1 = moblieDirector.construct1();
        System.out.println("\n旗舰机：");
        Mobile mobile2 = moblieDirector.construct2();
    }
}
