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
     * 6. Borrar Dog shiva de cada test
     * 7. Correr los tests
     */

    Dog shiva;

    @BeforeEach
    public void setUp(){
        shiva = new Dog("Shiva", 5, "male", false);
    }
    
    @Test
    public void shouldDogGetAdopted(){
        //ARRANGE
        //Dog shiva = new Dog("Shiva", 5, "male", true); reemplazado por @BeforeEach
        //ACT
        String result = shiva.adopt();
        //ASSERT
        assertEquals("Shiva has been adopted!", result);
    }

    @Test
    public void shouldDogCannotBeAdoptedTwice(){
        //Dog shiva = new Dog("Shiva", 5, "male", true);
        shiva.adopt();
        String result = shiva.adopt();
        assertEquals("Shiva is already adopted", result);
    }

    @Test
    public void shouldMaleDogCannotGaveBirth(){
        //Dog shiva = new Dog("Shiva", 5, "male", true);
        String result = shiva.gaveBirth(3);
        assertEquals("Male dogs cannot give birth", result);
    }

    @Test
    public void shouldMaleDogCannotGiveBirth(){
        //Dog shiva = new Dog("Shiva", 5, "male", true);
        String result = shiva.gaveBirth(3);
        //ASSERT
        assertEquals("Male dogs cannot give birth", result);
    }

    @Test
    public void shouldFemaleDogGaveBirth(){
        Dog luna = new Dog("Luna",12, "female", true);
        String result = luna.gaveBirth(10);
        assertEquals("Luna has 10 puppies.", result);
    }

    @Test
    public void shouldDogCantReceiveGiftIfIsNotBeenAdopted(){
        //Dog shiva = new Dog("Shiva", 5, "male", true);
        String result = shiva.giveGift();
        assertEquals("Shiva must get adopted before gift", result);
    }

    @Test
    public void shouldDogReceiveGift(){
        //Dog shiva = new Dog("Shiva", 5, "male", true);
        shiva.adopt();
        String result = shiva.giveGift();
        assertEquals("Shiva received a toy and a bone", result);
    }
}
