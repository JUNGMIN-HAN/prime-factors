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
}
