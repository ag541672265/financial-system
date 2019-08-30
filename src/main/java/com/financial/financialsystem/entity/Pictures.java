package com.financial.financialsystem.entity;

public class Pictures {
    private Integer pic_id,pic_goods_id;
    private String pic_address,pic_type,pic_type2;

    public Integer getPic_id() {
        return pic_id;
    }

    public void setPic_id(Integer pic_id) {
        this.pic_id = pic_id;
    }

    public Integer getPic_goods_id() {
        return pic_goods_id;
    }

    public void setPic_goods_id(Integer pic_goods_id) {
        this.pic_goods_id = pic_goods_id;
    }

    public String getPic_address() {
        return pic_address;
    }

    public void setPic_address(String pic_address) {
        this.pic_address = pic_address;
    }

    public String getPic_type() {
        return pic_type;
    }

    public void setPic_type(String pic_type) {
        this.pic_type = pic_type;
    }

    public String getPic_type2() {
        return pic_type2;
    }

    public void setPic_type2(String pic_type2) {
        this.pic_type2 = pic_type2;
    }
}
