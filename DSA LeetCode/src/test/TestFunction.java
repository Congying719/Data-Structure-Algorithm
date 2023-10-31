package test;

import org.junit.Test;
import utils.CheckPrime;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestFunction {

    @Test
    public void testIsPrime() {
        boolean flag = CheckPrime.isPrime(89);
        assertTrue(flag);
        // assertFalse(TestBasic.isPrime(5));
        assertFalse(CheckPrime.isPrime(8));

    }
}
