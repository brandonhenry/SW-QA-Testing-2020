import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.*;
import org.junit.jupiter.params.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Assignment2Tests {

    /**
     * Tests functionality of getBMI using http://extoxnet.orst.edu/faqs/dietcancer/web2/twohowto.html
     * @return
     */
    @Test
    void testBMI(){
        int feet = 5;
        int inches = 3;
        int weight = 125;
        String answerCat = "Normal Weight";
        int answerBMI = 23;
        String answer = "BMI: " + answerBMI + ", " + answerCat;
        Helper helper = new Helper();
        assertEquals(answer, helper.getBMI(feet, inches, weight));
    }

    /**
     * Tests negative values with getBMI function
     * @return
     */
    @Test
    void testBMINegativeValue(){
        int feet = -5;
        int inches = 3;
        int weight = 125;
        String answerCat = "Normal Weight";
        int answerBMI = 23;
        String answer = "Negative values are not accepted";
        Helper helper = new Helper();
        assertEquals(answer, helper.getBMI(feet, inches, weight));
    }

    /**
     * Tests negative values with getBMI function
     * @return
     */
    @Test
    void testBMILimits(){
        int feet = 555;
        int inches = 344;
        int weight = 50000;
        String answerCat = "Underweight";
        int answerBMI = 1;
        String answer = "BMI: " + answerBMI + ", " + answerCat;
        Helper helper = new Helper();
        assertEquals(answer, helper.getBMI(feet, inches, weight));
    }

    /**
     * Tests getting retirement age function.
     */
    @Test
    void testSavings(){
        int currAge = 23;
        int salary = 50000;
        int percentSaved = 20;
        int savingGoal = 10000000;
        int age = 35;
        String answer = "Retirement goal will be met at age: " + age;
        Helper helper = new Helper();
        assertEquals(answer, helper.checkRetirement(currAge, salary, percentSaved, savingGoal));
    }

    /**
     * Tests getting retirement age function with negative input values.
     */
    @Test
    void testSavingsNegative(){
        int currAge = 23;
        int salary = -50000;
        int percentSaved = 20;
        int savingGoal = 10000000;
        int age = 35;
        String answer = "Negative values are not allowed.";
        Helper helper = new Helper();
        assertEquals(answer, helper.checkRetirement(currAge, salary, percentSaved, savingGoal));
    }

    /**
     * Tests getting retirement age function with negative input values.
     */
    @Test
    void testSavingsGoalNotMet(){
        int currAge = 23;
        int salary = 1;
        int percentSaved = 1;
        int savingGoal = 1000000000;
        int age = 35;
        String answer = "Retirement goal will be met at age: " + age;
        Helper helper = new Helper();
        assertEquals(answer, helper.checkRetirement(currAge, salary, percentSaved, savingGoal));
    }
}
