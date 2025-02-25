package com.pet_adoption;

public abstract class Pet {
    //Se definen primero sin modificador de acceso, luego al explicar la encapsulación se defeine el private
    private String name;
    private int age;
    private String sex;
    private boolean isAdopted;
    private boolean isPregnant;

    public Pet(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isAdopted = false; 
        this.isPregnant = false; 
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean getIsAdopted() {
        return this.isAdopted;
    }

    public void setIsAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }

    public boolean getIsPregnant() {
        return this.isPregnant;
    }

    public void setIsPregnant(boolean isPregnant) {
        this.isPregnant = isPregnant;
    }

    public String adopt(){
        if (!isAdopted) {
            this.isAdopted = true; //se pone this porque estamos cambiando su valor
            return name + " has been adopted!"; //no se pone this en name porque solo estamos llamando
        } else {
            return name + " is already adopted";
        }
    }

    public abstract String gaveBirth(int num);
}
