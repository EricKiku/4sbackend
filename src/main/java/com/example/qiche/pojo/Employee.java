package com.example.qiche.pojo;

public class Employee {
    private int eId;
    private String eJobnumber;
    private String eName;
    private String eGender;
    private String eAge;
    private String ePhone;
    private String eAvatar;
    private String eAddress;
    private String eServed;
    private int eEval;
    private int eWage;
    private String eJointime;

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eJobnumber='" + eJobnumber + '\'' +
                ", eName='" + eName + '\'' +
                ", eGender='" + eGender + '\'' +
                ", eAge='" + eAge + '\'' +
                ", ePhone='" + ePhone + '\'' +
                ", eAvatar='" + eAvatar + '\'' +
                ", eAddress='" + eAddress + '\'' +
                ", eServed='" + eServed + '\'' +
                ", eEval=" + eEval +
                ", eWage=" + eWage +
                ", eJointime='" + eJointime + '\'' +
                '}';
    }

    public String geteJobnumber() {
        return eJobnumber;
    }

    public void seteJobnumber(String eJobnumber) {
        this.eJobnumber = eJobnumber;
    }

    public Employee(int eId, String eJobnumber, String eName, String eGender, String eAge, String ePhone, String eAvatar, String eAddress, String eServed, int eEval, int eWage, String eJointime) {
        this.eId = eId;
        this.eJobnumber = eJobnumber;
        this.eName = eName;
        this.eGender = eGender;
        this.eAge = eAge;
        this.ePhone = ePhone;
        this.eAvatar = eAvatar;
        this.eAddress = eAddress;
        this.eServed = eServed;
        this.eEval = eEval;
        this.eWage = eWage;
        this.eJointime = eJointime;
    }

    public Employee(int eId, String eName, String eGender, String eAge, String ePhone, String eAvatar, String eAddress, String eServed, int eEval, int eWage, String eJointime) {
        this.eId = eId;
        this.eName = eName;
        this.eGender = eGender;
        this.eAge = eAge;
        this.ePhone = ePhone;
        this.eAvatar = eAvatar;
        this.eAddress = eAddress;
        this.eServed = eServed;
        this.eEval = eEval;
        this.eWage = eWage;
        this.eJointime = eJointime;
    }

    public Employee() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public String geteAge() {
        return eAge;
    }

    public void seteAge(String eAge) {
        this.eAge = eAge;
    }

    public String getePhone() {
        return ePhone;
    }

    public void setePhone(String ePhone) {
        this.ePhone = ePhone;
    }

    public String geteAvatar() {
        return eAvatar;
    }

    public void seteAvatar(String eAvatar) {
        this.eAvatar = eAvatar;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String geteServed() {
        return eServed;
    }

    public void seteServed(String eServed) {
        this.eServed = eServed;
    }

    public int geteEval() {
        return eEval;
    }

    public void seteEval(int eEval) {
        this.eEval = eEval;
    }

    public int geteWage() {
        return eWage;
    }

    public void seteWage(int eWage) {
        this.eWage = eWage;
    }

    public String geteJointime() {
        return eJointime;
    }

    public void seteJointime(String eJointime) {
        this.eJointime = eJointime;
    }
}
