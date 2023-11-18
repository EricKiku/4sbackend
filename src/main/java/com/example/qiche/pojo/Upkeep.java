package com.example.qiche.pojo;

public class Upkeep {
    private int uk_id;
    private int u_id;
    private int c_id;
    private String uk_mileage;
    private String uk_type;
    private String uk_number;
    private String uk_description;
    private String uk_date;

    public Upkeep(int uk_id, int u_id, int c_id, String uk_mileage, String uk_type, String uk_number, String uk_description, String uk_date) {
        this.uk_id = uk_id;
        this.u_id = u_id;
        this.c_id = c_id;
        this.uk_mileage = uk_mileage;
        this.uk_type = uk_type;
        this.uk_number = uk_number;
        this.uk_description = uk_description;
        this.uk_date = uk_date;
    }

    public int getUk_id() {
        return uk_id;
    }

    public void setUk_id(int uk_id) {
        this.uk_id = uk_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getUk_mileage() {
        return uk_mileage;
    }

    public void setUk_mileage(String uk_mileage) {
        this.uk_mileage = uk_mileage;
    }

    public String getUk_type() {
        return uk_type;
    }

    public void setUk_type(String uk_type) {
        this.uk_type = uk_type;
    }

    public String getUk_number() {
        return uk_number;
    }

    public void setUk_number(String uk_number) {
        this.uk_number = uk_number;
    }

    public String getUk_description() {
        return uk_description;
    }

    public void setUk_description(String uk_description) {
        this.uk_description = uk_description;
    }

    public String getUk_date() {
        return uk_date;
    }

    public void setUk_date(String uk_date) {
        this.uk_date = uk_date;
    }

    @Override
    public String toString() {
        return "Upkeep{" +
                "uk_id=" + uk_id +
                ", u_id=" + u_id +
                ", c_id=" + c_id +
                ", uk_mileage='" + uk_mileage + '\'' +
                ", uk_type='" + uk_type + '\'' +
                ", uk_number='" + uk_number + '\'' +
                ", uk_description='" + uk_description + '\'' +
                ", uk_date='" + uk_date + '\'' +
                '}';
    }
}
