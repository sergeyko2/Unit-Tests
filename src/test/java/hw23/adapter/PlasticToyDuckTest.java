package hw23.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlasticToyDuckTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    PlasticToyDuck plasticToyDuck = new PlasticToyDuck();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void squeak_OK() {
        plasticToyDuck.squeak();
        Assertions.assertEquals("Squeak", outputStreamCaptor.toString()
                .trim());
    }

}
