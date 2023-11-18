package com.example.qiche.pojo;

public class Testdrive {
    private int tdId;
    private String tdName;
    private String tdGender;
    private String tdPhone;
    private String tdProvince;
    private String tdCity;
    private String tdDealer;
    private String tdDate;
    private String tdModel;

    public Testdrive() {
    }

    public Testdrive(int tdId, String tdName, String tdGender, String tdPhone, String tdProvince, String tdCity, String tdDealer, String tdDate, String tdModel) {
        this.tdId = tdId;
        this.tdName = tdName;
        this.tdGender = tdGender;
        this.tdPhone = tdPhone;
        this.tdProvince = tdProvince;
        this.tdCity = tdCity;
        this.tdDealer = tdDealer;
        this.tdDate = tdDate;
        this.tdModel = tdModel;
    }

    public int getTdId() {
        return tdId;
    }

    public void setTdId(int tdId) {
        this.tdId = tdId;
    }

    public String getTdName() {
        return tdName;
    }

    public void setTdName(String tdName) {
        this.tdName = tdName;
    }

    public String getTdGender() {
        return tdGender;
    }

    public void setTdGender(String tdGender) {
        this.tdGender = tdGender;
    }

    public String getTdPhone() {
        return tdPhone;
    }

    public void setTdPhone(String tdPhone) {
        this.tdPhone = tdPhone;
    }

    public String getTdProvince() {
        return tdProvince;
    }

    public void setTdProvince(String tdProvince) {
        this.tdProvince = tdProvince;
    }

    public String getTdCity() {
        return tdCity;
    }

    public void setTdCity(String tdCity) {
        this.tdCity = tdCity;
    }

    public String getTdDealer() {
        return tdDealer;
    }

    public void setTdDealer(String tdDealer) {
        this.tdDealer = tdDealer;
    }

    public String getTdDate() {
        return tdDate;
    }

    public void setTdDate(String tdDate) {
        this.tdDate = tdDate;
    }

    public String getTdModel() {
        return tdModel;
    }

    public void setTdModel(String tdModel) {
        this.tdModel = tdModel;
    }

    @Override
    public String toString() {
        return "Testdrive{" +
                "tdId=" + tdId +
                ", tdName='" + tdName + '\'' +
                ", tdGender='" + tdGender + '\'' +
                ", tdPhone='" + tdPhone + '\'' +
                ", tdProvince='" + tdProvince + '\'' +
                ", tdCity='" + tdCity + '\'' +
                ", tdDealer='" + tdDealer + '\'' +
                ", tdDate='" + tdDate + '\'' +
                ", tdModel='" + tdModel + '\'' +
                '}';
    }
}
