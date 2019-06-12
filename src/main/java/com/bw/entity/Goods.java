package com.bw.entity;

public class Goods {
    private Integer gid;

    private String gname;

    private Integer bId;

    private Integer gkIs;

    private Integer size;

    private Double privce;

    private Integer count;

    private String tag;

    private String img;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getGkIs() {
        return gkIs;
    }

    public void setGkIs(Integer gkIs) {
        this.gkIs = gkIs;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPrivce() {
        return privce;
    }

    public void setPrivce(Double privce) {
        this.privce = privce;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}