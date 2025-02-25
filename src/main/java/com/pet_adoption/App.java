package com.pet_adoption;

public class App 
{
    public static void main( String[] args )
    {
        //No se puede instanciar Pet porque es abstracto, hemos de crear los hijos
        //Pet pet = new Pet("Pocho", 13, "male");

        //Crear una persona
        Adopter adopter = new Adopter("María", "Galarza", 675949755, "Av. Aragó, 267");
        System.out.println(adopter.getName() + " " + adopter.getLastname() + " con número de móvil " + adopter.getPhone() + " y vive en " + adopter.getAddress());

        //Crear un perro y acceder a su nombre public y modificarlo
        /* Dog pocho = new Dog("Pocho", 1, "male", false);
        System.out.println(pocho.name);
        pocho.name = "Puki";
        System.out.println(pocho.name); */


        //Acceder a los métodos mediante getters
        Dog dog = new Dog("Pocho", 13, "male", false);
        String bites = dog.getBites() ? "bites" : "does not bites";
        System.out.println("Is adopted: " + dog.getIsAdopted());
        System.out.println(dog.gaveBirth(3));
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old," + " is a " + dog.getSex() + " and " + bites);
        dog.setIsAdopted(true);
        System.out.println("Is adopted: " + dog.getIsAdopted());

        //Crear un gato
        Cat cat =  new Cat("Fufa", 10, "female", true);
        System.out.println(cat.getName() + " has " + cat.getAge());
        System.out.println(cat.gaveBirth(4));

        //Ejecutar la interfaz
        Dog doggy = new Dog("Doggy", 2, "male", false);
        doggy.adopt();
        System.out.println(doggy.giveGift());
        
        Cat catt = new Cat("Catt", 2, "male", true);
        catt.adopt();
        System.out.println(catt.giveGift());

        Adopter alex = new Adopter("Alex", "Galarza", 345545333, "El Clot");
        System.out.println(alex.giveGift());

    }
}
