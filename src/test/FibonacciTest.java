import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void フィボナッチ数列のn番目の値を返す() {
        Fibonacci test = new Fibonacci();
        long expected = 55;
        long result = test.calc(10);
        assertEquals(expected, result);
    }

    @Test void フィボナッチ数列の1番目の値を返す() {
        Fibonacci test = new Fibonacci();
        long expected = 1;
        long result = test.calc(1);
        assertEquals(expected, result);
    }

    @Test void フィボナッチ数列の2番目の値を返す() {
        Fibonacci test = new Fibonacci();
        long expected = 1;
        long result = test.calc(2);
        assertEquals(expected, result);
    }

    @Test void フィボナッチ数列の0番目の値を返す() {
        Fibonacci test = new Fibonacci();
        long expected = 0;
        long result = test.calc(0);
        assertEquals(expected, result);
    }

    @Test void フィボナッチ数列のー10番目の値を返す() {
        Fibonacci test = new Fibonacci();
        long expected = 0;
        long result = test.calc(-10);
        assertEquals(expected, result);
    }
}