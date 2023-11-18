package com.example.qiche.pojo;

public class Admin {
    private int aId;
    private String aName;
    private String aEmail;
    private String aPwd;
    private int aRemeberpwd;

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aEmail='" + aEmail + '\'' +
                ", aPwd='" + aPwd + '\'' +
                ", aRemeberpwd=" + aRemeberpwd +
                '}';
    }

    public Admin() {
    }

    public Admin(String aName, String aEmail, String aPwd) {
        this.aName = aName;
        this.aEmail = aEmail;
        this.aPwd = aPwd;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getaPwd() {
        return aPwd;
    }

    public void setaPwd(String aPwd) {
        this.aPwd = aPwd;
    }

    public int getaRemeberpwd() {
        return aRemeberpwd;
    }

    public void setaRemeberpwd(int aRemeberpwd) {
        this.aRemeberpwd = aRemeberpwd;
    }

    public Admin(int aId, String aName, String aEmail, String aPwd, int aRemeberpwd) {
        this.aId = aId;
        this.aName = aName;
        this.aEmail = aEmail;
        this.aPwd = aPwd;
        this.aRemeberpwd = aRemeberpwd;
    }
}
