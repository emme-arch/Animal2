import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Dog dog = new Dog();
    Cat cat = new Cat();


    @Test
    void TestDogSound(){
        //No instruction on what to test.
    }

    @Test
    void TestDogEats(){
        assertEquals("Food",dog.eat(),"Does dog eat Food");// Test should pass
        assertEquals("food",dog.eat(),"Does dog eat food");// Test should fail,
    }

    @Test
    void TestCatSound(){
        assertEquals("Barkark",cat.sound(),"Does cat Barkark should");//Test should fail
        assertEquals("Meow",cat.sound(),"Does cat Meow should"); //Test should pass
    }

    @Test
    void TestCatEats(){
        assertEquals("meat",cat.eat(),"Does cat eat meat"); //Test should fail
        assertEquals("Food",cat.eat(),"Does cat eat Food"); //Test should pass
        assertEquals("food",cat.eat(),"Does cat eat food"); //Test should fail
    }

    @Test
    void sound() {
    }

    @Test
    void eat() {
    }
}