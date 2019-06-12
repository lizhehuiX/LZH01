package com.bw.entity;

public class GoodsKind {
    private Integer gkId;

    private String gkName;

    public Integer getGkId() {
        return gkId;
    }

    public void setGkId(Integer gkId) {
        this.gkId = gkId;
    }

    public String getGkName() {
        return gkName;
    }

    public void setGkName(String gkName) {
        this.gkName = gkName == null ? null : gkName.trim();
    }
}