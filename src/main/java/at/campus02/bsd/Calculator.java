package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        logger.debug(String.format("Add called with parameters: %f and %f.", number1, number2));
        return number1 + number2;
    }
    public double subtract(double number1, double number2) {
        logger.debug(String.format("Subtract called with parameters: %f and %f.", number1, number2));
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        logger.debug(String.format("Divide called with parameters: %f and %f.", number1, number2));
        if (number2 == 0) {
            logger.error("Divide called with 0. Universe will collapse in 3 ... 2 ... 1");
        }
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        logger.debug(String.format("Multiply called with parameters: %f and %f.", number1, number2));
        return number1 * number2;
    }

    public long factorial(int max) {
        int result = 1;
        if(max < 0) {
            return 0;
        }
        for (int faculty = 2; faculty <= max; faculty++) {
            result *= faculty;
        }
        return result;
    }
}
