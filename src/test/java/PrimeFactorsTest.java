import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {
    @Test
    void testPrimefactorof1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(),primeFactor.of(1));
    }

    @Test
    void testPrimefactorof2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2),primeFactor.of(2));
    }
}
