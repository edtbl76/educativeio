package fundamentals.oop.polymorphism;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {
    Rectangle rectangle = new Rectangle();

    @AfterEach
    void tearDown() {
        rectangle.setHeight(0);
        rectangle.setWidth(0);
    }

    @Test
    void testGetArea() {
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        double result = rectangle.getArea();
        assertEquals(50, result);
    }

    @Test
    void testSetWidth() {
        rectangle.setWidth(10);
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    void testSetHeight() {
        rectangle.setHeight(10);
        assertEquals(10, rectangle.getHeight());
    }

    @Test
    void testToString() {
        String result = rectangle.toString();
        assertEquals("Rectangle(width=0.0, height=0.0)", result);
    }

    @Test
    void testEquals() {
        boolean result = rectangle.equals(new Rectangle());
        assertTrue(result);
    }

    @Test
    void testCanEqual() {
        Rectangle newRectangle = new Rectangle();
        boolean result = rectangle.canEqual(newRectangle);
        assertTrue(result);
    }

    @Test
    void testHashCode() {
        int result = rectangle.hashCode();
        assertEquals(new Rectangle().hashCode(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme