package com.example.qiche.pojo;

public class User {
    private Integer uId;
    private String uEmail;
    private String uPwd;

    public User() {
    }

    public User(Integer uId, String uEmail, String uPwd) {
        this.uId = uId;
        this.uEmail = uEmail;
        this.uPwd = uPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uEmail='" + uEmail + '\'' +
                ", uPwd='" + uPwd + '\'' +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }
}
