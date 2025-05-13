package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc;
    private static final double DELTA = 1e-10;

    @SuppressWarnings("unused")
    @BeforeEach
    void setup() {
        this.calc = new Calculator();
    }

    @DisplayName("Testing add()")
    @Test
    void testAdd() {
        assertEquals(15.0, this.calc.add(8, 7), DELTA);
        assertEquals(50, this.calc.add(25, 25), DELTA);
        assertEquals(99.9, this.calc.add(50, 49.9), DELTA);
    }

    @DisplayName("Testing subtract()")
    @Test
    void testSubtract() {
        assertEquals(99.6, this.calc.subtract(101.4, 1.8), DELTA);
        assertEquals(0, this.calc.subtract(-1099, -1099), DELTA);
        assertEquals(367, this.calc.subtract(534, 167), DELTA);
    }

    @DisplayName("Testing multiply()")
    @Test
    void testMultiply() {
        assertEquals(312.84, this.calc.multiply(23.7, 13.2), DELTA);
        assertEquals(24, this.calc.multiply(this.calc.multiply(2, 3), 4), DELTA);
        assertEquals(0, this.calc.multiply(86858393757685854.0, 0), DELTA);
    }

    @DisplayName("Testing division by 0")
    @Test
    void testDivideByZero() {
        assertEquals(Double.POSITIVE_INFINITY, this.calc.divide(15, 0), DELTA);
    }

    @DisplayName("Testing division()")
    @Test
    void testDivide() {
        assertEquals(2, this.calc.divide(100, 50), DELTA);
        assertEquals(0.5, this.calc.divide(50, 100), DELTA);
    }

}
