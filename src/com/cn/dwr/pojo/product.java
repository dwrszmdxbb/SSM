package com.cn.dwr.pojo;
public class product {
    private int id;
    private int cid;
    private String productname;
    private String descs;

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    private int statusIn;

    public int getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(int statusIn) {
        this.statusIn = statusIn;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }



    public product() {
    }

    public product(int id, int cid, String productname, String descs, int statusIn) {
        this.id = id;
        this.cid = cid;
        this.productname = productname;
        descs = descs;
        this.statusIn = statusIn;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
