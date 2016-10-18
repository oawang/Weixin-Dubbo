package com.cheng.weixin.web.mobile.result.mall;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Desc: 商城商品
 * Author: hp
 * Date: 2016/9/9
 */
public class MallProduct {
    private String id;
    private String name;
    private String price;
    private String picLink;
    private int width;
    private int height;
    private String tag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPicLink() {
        return picLink;
    }

    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
