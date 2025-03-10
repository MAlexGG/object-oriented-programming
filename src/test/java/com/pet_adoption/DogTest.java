package com.pet_adoption;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogTest {

    /* 
     * 1. Añadir dependencia JUnit Jupiter (Aggregator) al archivo pom.xml y borrar la de JUnit
     * 2. Crear la clase DogTest.java
     * 3. Anotar la clase con @Test
     * 4. Crear un método de prueba llamado shouldDogGetAdopted
     * 5. Hacer un @BeforeEach para inicializar el objeto Dog
     * 6. Borrar Dog firulais de cada test
     * 7. Correr los tests
     */

    Dog firulais;

     @BeforeEach
    public void setUp(){
        firulais = new Dog("Firulais", 12, "male", true);
    }
    
    @Test
    public void shouldDogGetAdopted(){
        //Dog firulais = new Dog("Firulais", 12, "male", true);
        String actual = firulais.adopt();
        assertEquals(actual, "Firulais has been adopted!");
    }

    @Test
    public void shouldDogCannotBeAdoptedTwice(){
        //Dog firulais = new Dog("Firulais", 12, "male", true);
        firulais.adopt();
        String actual = firulais.adopt();
        assertEquals(actual, "Firulais is already adopted");
    }

    @Test
    public void shouldMaleDogCannotGaveBirth(){
        //Dog firulais = new Dog("Firulais",12, "male", true);
        String actual = firulais.gaveBirth(3);
        assertEquals(actual, "Male dogs cannot give birth");
    }

    @Test
    public void shouldFemaleDogGaveBirth(){
        Dog lila = new Dog("Lila",12, "female", true);
        String actual = lila.gaveBirth(3);
        assertEquals(actual, "Lila has 3 puppies.");
    }

    @Test
    public void shouldDogCantReceiveGiftIfIsNotBeenAdopted(){
        //Dog firulais = new Dog("Firulais",12, "male", true);
        String actual = firulais.giveGift();
        assertEquals(actual, "You must be adopted before the gift");
    }

    @Test
    public void shouldDogReceiveGift(){
        //Dog firulais = new Dog("Firulais",12, "male", true);
        firulais.adopt();
        String actual = firulais.giveGift();
        assertEquals(actual, "Firulais received a toy and a bone");
    }
}
