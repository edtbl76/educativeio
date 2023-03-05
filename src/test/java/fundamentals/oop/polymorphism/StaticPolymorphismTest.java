package fundamentals.oop.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaticPolymorphismTest {

/*    @Test
    void testAdd() {
        int result = staticPolymorphism.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    void testAdd2() {
        int result = staticPolymorphism.add(0, 0, 0);
        assertEquals(0, result);
    }*/

    /*
        Based on the way the method is constructed, I only need
        one test to cover all of the methods.
     */
    @Test
    void testAdd3() {
        int result = StaticPolymorphism.add(1, 2, 3, 4);
        assertEquals(10, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme