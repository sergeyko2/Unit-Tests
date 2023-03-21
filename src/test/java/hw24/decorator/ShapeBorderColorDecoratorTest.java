package hw24.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ShapeBorderColorDecoratorTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    ShapeBorderColorDecorator decorator;
    Shape shape;

    @BeforeEach
    public void setup() {
        shape = mock(Shape.class);
        decorator = new ShapeBorderColorDecorator(shape, Color.BLACK);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void draw_OK() {
        decorator.draw();
        verify(shape, times(1)).draw();
        assertEquals("Border Color: java.awt.Color[r=0,g=0,b=0]", outputStreamCaptor.toString()
                .trim());
    }
}
