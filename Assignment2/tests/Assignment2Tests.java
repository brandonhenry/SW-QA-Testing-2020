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
     * Tests functionality of getBMI using http://extoxnet.orst.edu/faqs/dietcancer/web2/twohowto.html
     * @return
     */
    @Test
    void testBMINegativeValue(){
        int feet = -5;
        int inches = 3;
        int weight = 125;
        String answerCat = "Normal Weight";
        int answerBMI = 23;
        String answer = "BMI: " + answerBMI + ", " + answerCat;
        Helper helper = new Helper();
        assertEquals(answer, helper.getBMI(feet, inches, weight));
    }
}
