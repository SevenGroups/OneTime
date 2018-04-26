package com.bw.com.onetimedemo.bean;

/**
 * Created by tangxueqin on 2018/4/26.
 */

public class SidePullBean {
    private int img;
    private String name;

    public SidePullBean(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
