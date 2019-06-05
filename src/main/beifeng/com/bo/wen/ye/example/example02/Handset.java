package com.bo.wen.ye.example.example02;

public abstract class Handset {

    private String brand;// 品牌
    private String type;// 型号

    public Handset() {
    }
    public Handset(String brand, String type) {

        this.brand = brand;
        this.type = type;
    }

    public abstract void sendInfo();// 发送短信

    public abstract void call();// 打电话

    public abstract void info();// 手机介绍

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
