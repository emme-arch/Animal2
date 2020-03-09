import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Dog dog = new Dog();
    Cat cat = new Cat();

    void TestDogSound() {
    }

    @Test
    void TestDogEats() {
        assertEquals("food".toLowerCase(),dog.eat().toLowerCase(),"Does dog eat Food");
        assertEquals("food".toLowerCase(),dog.eat().toLowerCase(),"Does dog eat food");
    }
    @Test
    void TestCatSound() {
        assertEquals("Barkark".toLowerCase(),cat.sound().toLowerCase(),"Does cat Barkark");
        assertEquals("Meow".toLowerCase(),cat.sound().toLowerCase(),"Does cat Meow");

    }
    @Test
    void TestCatEats() {
        assertEquals("meat".toLowerCase(),cat.eat().toLowerCase(),"Does cat eat meat");
        assertEquals("Food".toLowerCase(),cat.eat().toLowerCase(),"Does cat eat Food");
        assertEquals("food".toLowerCase(),cat.eat().toLowerCase(),"Does cat eat food");
    }

}