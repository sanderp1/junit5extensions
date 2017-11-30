import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HelloWorldTest {

    @Mock
    World worldMock;

    @Test
    void hello() {
        Mockito.when(worldMock.sayWhat()).thenReturn("World");
        HelloWorld helloWorld = new HelloWorld(worldMock);
        assertThat(helloWorld.hello()).isEqualTo("Hello World!");
    }
}