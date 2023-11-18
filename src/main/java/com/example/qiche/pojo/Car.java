package com.example.qiche.pojo;

public class Car {
    private int c_id;
    private String c_brand;
    private String c_model;
    private String c_config;
    private String c_color;
    private String c_gear;
    private int c_count;
    private float c_price;

    @Override
    public String toString() {
        return "Car{" +
                "c_id=" + c_id +
                ", c_brand='" + c_brand + '\'' +
                ", c_model='" + c_model + '\'' +
                ", c_config='" + c_config + '\'' +
                ", c_color='" + c_color + '\'' +
                ", c_gear='" + c_gear + '\'' +
                ", c_count=" + c_count +
                ", c_price=" + c_price +
                '}';
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_brand() {
        return c_brand;
    }

    public void setC_brand(String c_brand) {
        this.c_brand = c_brand;
    }

    public String getC_model() {
        return c_model;
    }

    public void setC_model(String c_model) {
        this.c_model = c_model;
    }

    public String getC_config() {
        return c_config;
    }

    public void setC_config(String c_config) {
        this.c_config = c_config;
    }

    public String getC_color() {
        return c_color;
    }

    public void setC_color(String c_color) {
        this.c_color = c_color;
    }

    public String getC_gear() {
        return c_gear;
    }

    public void setC_gear(String c_gear) {
        this.c_gear = c_gear;
    }

    public int getC_count() {
        return c_count;
    }

    public void setC_count(int c_count) {
        this.c_count = c_count;
    }

    public float getC_price() {
        return c_price;
    }

    public void setC_price(float c_price) {
        this.c_price = c_price;
    }

    public Car(int c_id, String c_brand, String c_model, String c_config, String c_color, String c_gear, int c_count, float c_price) {
        this.c_id = c_id;
        this.c_brand = c_brand;
        this.c_model = c_model;
        this.c_config = c_config;
        this.c_color = c_color;
        this.c_gear = c_gear;
        this.c_count = c_count;
        this.c_price = c_price;
    }
}
