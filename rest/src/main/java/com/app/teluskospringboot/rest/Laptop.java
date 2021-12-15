package com.app.teluskospringboot.rest;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
    public String lid;
    public String brand;
    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", lid=" + lid + "]";
    }

    public void compile(){
        System.out.println("Compiling this new laptop");
    }
    public String getLid() {
        return lid;
    }
    public void setLid(String lid) {
        this.lid = lid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

}
