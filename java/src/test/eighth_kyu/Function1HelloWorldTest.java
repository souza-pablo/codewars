package test.eighth_kyu;

import main.eighth_kyu.Function1HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Function1HelloWorldTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", Function1HelloWorld.greet());
    }
}