package com.cn.dwr.pojo;

public class catagory {
    private int id;
    private String name;

    public catagory(int id, String name, String explain) {
        this.id = id;
        this.name = name;
        Explain = explain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return Explain;
    }

    public void setExplain(String explain) {
        Explain = explain;
    }

    public catagory() {
    }

    private String Explain;

}
