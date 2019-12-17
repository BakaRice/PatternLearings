package com.example.Observer;

public class Test {
    public static void main(String[] args) {
        //开始有2个人观察生产问题
        ProductionProblems ProductionProblems = new ProductionProblems();
        ProductionProblems.register(new Worker(1, "Lily"));
       Worker jack = new Worker(2, "Jack");
        ProductionProblems.register(jack);
        ProductionProblems.register(new QualityControlWorker(1, "TAN"));

        //发生错误
        ProductionProblems.setMessage("生产线故障");
        ProductionProblems.notifyObservers();
        System.out.println("--------------------------------------");

        //后来，有一个人停止了观察生产
        ProductionProblems.remove(jack);
        //发生错误
        ProductionProblems.setMessage("装配线故障");
        ProductionProblems.notifyObservers();
    }

}
