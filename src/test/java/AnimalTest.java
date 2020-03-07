import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTests {
    Cat cat = new Cat();
    Dog dog= new Dog();
    @Test
    void TestDogSound(){
        assertEquals("Bark",dog.sound());
    }
    @Test
    void TestDogEats(){
       assertEquals("Food", dog.eat());
    }
    @Test
    void TestCatSound(){
        assertEquals("Meow",cat.sound());

    }
    @Test
    void TestCatEats(){
       assertEquals("Food",cat.eat());
    }
}