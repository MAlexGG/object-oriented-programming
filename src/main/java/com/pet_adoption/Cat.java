package com.pet_adoption;

public class Cat extends Pet implements Gift{

    private boolean scratches;

    public Cat(String name, int age, String sex, boolean scratches) {
        super(name, age, sex);
        this.scratches = scratches;
    }

    public boolean getScratches() {
        return this.scratches;
    }

    public void setScratches(boolean scratches) {
        this.scratches = scratches;
    }

    @Override //Usamos anotaciones
    public String gaveBirth(int num) {
        if(getSex() == "male"){
            return "Male cats cannot give birth";
        }
        return getName() + " has " + num + " kittens.";
    }

    @Override
    public String giveGift() {
        if(!getIsAdopted()){
            return "You must be adopted before the gift";   
           }
        return getName() + " received a toy and a fish";
    }
    
    
}
