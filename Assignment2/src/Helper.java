public class Helper {
    public String getBMI(int feet, int inches, int weight){
        System.out.println(feet);
        System.out.println(inches);
        System.out.println(weight);
        // multiply weight by 0.45
        double weightBMI = weight * 0.45;
        // multiple height in inches by 0.025
        int heightInInches = (feet * 12) + inches;
        double heightBMI = heightInInches * 0.025;
        // square result
        double heightSquared = heightBMI * heightBMI;
        // divide height squared by weight
        double result = weightBMI / heightSquared;

        String weightCat = "Underweight";

        if (result <= 18.5){
            weightCat = BMI.UNDERWEIGHT.toString();
        } else if (result > 18.5 && result < 24.9){
            weightCat = BMI.NORMAL.toString();
        } else if (result >= 25 && result < 29.9){
            weightCat = BMI.OVERWEIGHT.toString();
        } else {
            weightCat = BMI.OBESE.toString();
        }

        return "BMI: " + Math.round(result) + ", " + weightCat;
    }

    /**
     *  Input user's current age, annual
     * salary, percentage saved (employer
     * matches 35% of savings). Input desired re
     * tirement savings goal. Output what age
     * savings goal will be met. You can assume d
     * eath at 100 years (therefore, indicate if the
     * savings goal is not met).
     */
    private int getRetirementAge(int currentAge, int salary, int percentSaved, int savingsGoal){
        int age = currentAge;
        double saved = (salary * (percentSaved / 100.0) ) * 0.35;
        while (saved < savingsGoal) {
            age++;
            saved *= 2;
            if (age >= 100 || saved == savingsGoal) break;
        }
        return age;
    }

    public String checkRetirement(int currentAge, int salary, int percentSaved, int savingsGoal) {
        int age = getRetirementAge(currentAge, salary, percentSaved, savingsGoal);
        System.out.println(age);
        if (age >= 100) {
            return "Retirement goal could not be met.";
        }
        return "Retirement goal will be met at age: " + age;
    }
}
