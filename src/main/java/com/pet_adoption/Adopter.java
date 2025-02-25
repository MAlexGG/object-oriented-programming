package com.pet_adoption;

public class Adopter implements Gift {
    
    private String name;
    private String lastname;
    private int phone;
    private String address;


    public Adopter(String name, String lastname, int phone, String address) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String giveGift() {
        return name + " recceived a t-shirt";
    }

}