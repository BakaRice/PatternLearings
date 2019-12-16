package com.example.Observer;

public class Worker implements Observer {

    /*
        员工编号
         */
    private Integer id;
    /*
    员工名称
     */
    private String name;

    @Override
    public void update(String message) {
        System.out.println(name +" Received Problem "+ message);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
