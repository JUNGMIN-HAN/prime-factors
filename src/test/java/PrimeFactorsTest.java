import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    PrimeFactor primeFactor;

    @BeforeEach
    public void setup() throws Exception{
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimefactorof1() {
        assertEquals(Arrays.asList(),primeFactor.of(1));
    }

    @Test
    void testPrimefactorof2() {
        assertEquals(Arrays.asList(2),primeFactor.of(2));
    }

    @Test
    void testPrimefactorof3() {
        assertEquals(Arrays.asList(3),primeFactor.of(3));
    }

    @Test
    void testPrimefactorof4() {
        assertEquals(Arrays.asList(2,2),primeFactor.of(4));
    }

    @Test
    void testPrimefactorof6() {
        assertEquals(Arrays.asList(2,3),primeFactor.of(6));
    }

    @Test
    void testPrimefactorof9() {
        assertEquals(Arrays.asList(3,3),primeFactor.of(9));
    }

    @Test
    void testPrimefactorof12() {
        assertEquals(Arrays.asList(2, 2, 3),primeFactor.of(12));
    }
}
