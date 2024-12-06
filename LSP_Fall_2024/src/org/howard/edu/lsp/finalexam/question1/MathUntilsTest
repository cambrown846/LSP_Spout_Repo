//Camryn Brown

package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

//JUnit 5
public class MathUtilsTest {

    @Test
    public void testFactorial_validInput() {
        MathUtils mathUtils = new MathUtils();
        
        assertEquals(120, mathUtils.factorial(5));  
        assertEquals(1, mathUtils.factorial(1));    
        assertEquals(1, mathUtils.factorial(0));    
    }

    @Test
    public void testFactorial_negativeInput() {
        MathUtils mathUtils = new MathUtils();
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    
    @Test
    public void testIsPrime_validInput() {
        MathUtils mathUtils = new MathUtils();
        // Test for prime numbers
        assertTrue(mathUtils.isPrime(2));   
        assertTrue(mathUtils.isPrime(3));   
        assertTrue(mathUtils.isPrime(5));   
    }

    @Test
    public void testIsPrime_nonPrimeInput() {
        MathUtils mathUtils = new MathUtils();
        // Test for non-prime numbers
        assertFalse(mathUtils.isPrime(4));  
        assertFalse(mathUtils.isPrime(1));  
        assertFalse(mathUtils.isPrime(9));  
    }

    @Test
    public void testIsPrime_edgeCases() {
        MathUtils mathUtils = new MathUtils();
 
        assertFalse(mathUtils.isPrime(0));  
        assertFalse(mathUtils.isPrime(-5)); 
    }


    @Test
    public void testGcd_validInput() {
        MathUtils mathUtils = new MathUtils();
        
        assertEquals(6, mathUtils.gcd(54, 24));  
        assertEquals(1, mathUtils.gcd(35, 64));  
    }

    @Test
    public void testGcd_zeroInput() {
        MathUtils mathUtils = new MathUtils();
        
        assertEquals(5, mathUtils.gcd(5, 0));   
        assertEquals(10, mathUtils.gcd(0, 10)); 
    }

    @Test
    public void testGcd_bothZero() {
        MathUtils mathUtils = new MathUtils();
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }

    @Test
    public void testGcd_negativeInput() {
        MathUtils mathUtils = new MathUtils();
        
        assertEquals(6, mathUtils.gcd(-54, 24));  
        assertEquals(1, mathUtils.gcd(35, -64));  
    }
}
