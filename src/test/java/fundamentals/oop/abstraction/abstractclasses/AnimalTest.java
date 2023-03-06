package fundamentals.oop.abstraction.abstractclasses;

import fundamentals.oop.abstraction.Animal;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    Animal animal = new Animal() {
        @Override
        public void makeSound() {
            // do nothing.
        }
    };

    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(printStream);
    }

    @Test
    void testMove() {
        animal.move();
        String testData = animal.getClass().getSimpleName() + " is moving";
/*      trim() removes from head and tail. However abstract classes don't have
        names so this won't be properly defined, and it screws up the pattern matching.
        Instead, I used Apache Commons to trim from the right. */
        String result = StringUtils.stripEnd(byteArrayOutputStream.toString(), null);
        assertEquals(testData, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme