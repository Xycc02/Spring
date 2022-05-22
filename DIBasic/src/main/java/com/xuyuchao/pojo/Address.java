package com.xuyuchao.pojo;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-18:52
 * @Description:
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
