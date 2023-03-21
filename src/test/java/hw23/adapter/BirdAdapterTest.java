package hw23.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BirdAdapterTest {

    Bird bird = mock(Sparrow.class);
    BirdAdapter birdAdapter = new BirdAdapter(bird);

    @Test
    public void squeak_OK() {
        birdAdapter.squeak();
        verify(bird, times(1)).makeSound();
    }

}
