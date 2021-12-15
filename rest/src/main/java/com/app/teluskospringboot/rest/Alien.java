package com.app.teluskospringboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien{
    public int aid;
    public String name;
    @Autowired
    @Qualifier("laptop")
    private Laptop laptop;
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String tech;


    public Alien(){
        System.out.println("This is Alien created");
    }

    public void show(){
        System.out.println("In Show Method");
        laptop.compile(); 
    }
    
}