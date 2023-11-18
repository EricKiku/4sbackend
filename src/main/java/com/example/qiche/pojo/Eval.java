package com.example.qiche.pojo;

public class Eval {
    private int evId;
    private int eId;
    private String eName;
    private String evType;
    private String evEvaldate;
    private int evStar;
    private String evContent;


    @Override
    public String toString() {
        return "Eval{" +
                "evId=" + evId +
                ", eId=" + eId +
                ", evType='" + evType + '\'' +
                ", evEvaldate='" + evEvaldate + '\'' +
                ", evStar=" + evStar +
                ", evContent='" + evContent + '\'' +
                ", eName='" + eName + '\'' +
                '}';
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Eval() {
    }

    public Eval(int evId, int eId, String eName, String evType, String evEvaldate, int evStar, String evContent) {
        this.evId = evId;
        this.eId = eId;
        this.eName = eName;
        this.evType = evType;
        this.evEvaldate = evEvaldate;
        this.evStar = evStar;
        this.evContent = evContent;
    }

    public int getEvId() {
        return evId;
    }

    public void setEvId(int evId) {
        this.evId = evId;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEvType() {
        return evType;
    }

    public void setEvType(String evType) {
        this.evType = evType;
    }

    public String getEvEvaldate() {
        return evEvaldate;
    }

    public void setEvEvaldate(String evEvaldate) {
        this.evEvaldate = evEvaldate;
    }

    public int getEvStar() {
        return evStar;
    }

    public void setEvStar(int evStar) {
        this.evStar = evStar;
    }

    public String getEvContent() {
        return evContent;
    }

    public void setEvContent(String evContent) {
        this.evContent = evContent;
    }

    public Eval(int evId, int eId, String evType, String evEvaldate, int evStar, String evContent) {
        this.evId = evId;
        this.eId = eId;
        this.evType = evType;
        this.evEvaldate = evEvaldate;
        this.evStar = evStar;
        this.evContent = evContent;
    }
}
