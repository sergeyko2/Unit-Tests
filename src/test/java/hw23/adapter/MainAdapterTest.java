package hw23.adapter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MainAdapterTest {

    @InjectMocks
    @Spy
    private Sparrow sparrow;
    @Mock
    private PlasticToyDuck plasticToyDuck;

//    @Test
//    void birdAdapterTest() {
//        verify(sparrow, 1).fly();
//        verify(sparrow, 1).makeSound();
//
//    }

    @Test
    void mainAdapterTest(){

    }
}