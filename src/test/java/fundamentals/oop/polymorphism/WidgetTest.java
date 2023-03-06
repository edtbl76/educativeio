package fundamentals.oop.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WidgetTest {

        Widget widget = new Widget();

        @Test
        void testGetName() {
            assertEquals("Widget", widget.getName());
        }
}
