package com.pet_adoption;

public class Dog extends Pet implements Gift {

    private boolean bites;

    public Dog(String name, int age, String sex, boolean bites) {
        super(name, age, sex);
        this.bites = bites;    
    }

    public boolean getBites() {
        return this.bites;
    }

    public void setBites(boolean bites) {
        this.bites = bites;
    }
    
    @Override
    public String gaveBirth(int num) {
        if(getSex() == "male"){
            return "Male dogs cannot give birth";
        }
        return getName() + " has " + num + " puppies.";
    }

    @Override
    public String giveGift() {
        if(!getIsAdopted()){
         return "You must be adopted before the gift";   
        }
        return getName() + " received a toy and a bone";
    }
    
}
