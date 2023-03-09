package structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node nodeUnderTest;

    @BeforeEach
    void setUp() {
        nodeUnderTest = new Node(0);
    }

    @Test
    void testEquals() {
        assertEquals(nodeUnderTest, new Node(0));
    }

    @Test
    void testCanEqual() {
        assertTrue(nodeUnderTest.canEqual(new Node(0)));
    }

    @Test
    void testHashCode() {
        assertEquals(new Node(0).hashCode(), nodeUnderTest.hashCode());
    }

    @Test
    void testToString() {
        assertEquals(new Node(0).toString(), nodeUnderTest.toString());
    }

    @Test
    void testSetValue() {
        nodeUnderTest.setValue(1);
        assertEquals(1, nodeUnderTest.getValue());
    }

    @Test
    void testSetNext() {
        nodeUnderTest.setNext(new Node(5));
        assertEquals(new Node(5), nodeUnderTest.getNext());
    }


}
