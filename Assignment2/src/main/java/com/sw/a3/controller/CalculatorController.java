package com.sw.a3.controller;

import com.sw.a3.BMI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = "/calculate")
public class CalculatorController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String calculator = checkCalc(request);

        switch (calculator) {
            case "bmi":
                BMICalculator bmiCalculator = BMICalculator.fromRequestParameters(request);
                bmiCalculator.setBMI(request);
                break;

            case "retirement":
                RetirementCalculator retirementCalculator = RetirementCalculator.fromRequestParameters(request);
                retirementCalculator.setRetirementResult(request);
                break;
        }

        request.getRequestDispatcher("/").forward(request, response);
    }

    public String getBMI(int feet, int inches, int weight){
        BMICalculator bmiCalc = BMICalculator.fromValues(feet, inches, weight);
        return bmiCalc.bmiResult;
    }

    public String checkRetirement(int age, int salary, int percentSaved, int savingsGoal){
        RetirementCalculator retirementCalculator = RetirementCalculator.fromValues(age, salary, percentSaved, savingsGoal);
        return retirementCalculator.retirementResult;
    }

    private String checkCalc(HttpServletRequest request){
        return request.getParameter("calc").equals("Calculate Retirement Age") ? "retirement" : "bmi";
    }

    private static class BMICalculator {

        int feet;
        int inches;
        int weight;

        String bmiResult;

        public BMICalculator(int feet, int inches, int weight){
            this.feet = feet;
            this.inches = inches;
            this.weight = weight;
            this.bmiResult = getBMI(feet, inches, weight);
        }

        public static BMICalculator fromValues(int feet, int inches, int weight){
            return new BMICalculator(feet, inches, weight);
        }

        public static BMICalculator fromRequestParameters(HttpServletRequest request){

            int feet = Integer.parseInt(request.getParameter("heightFeet"));
            int inches = Integer.parseInt(request.getParameter("heightInches"));
            int weight = Integer.parseInt(request.getParameter("weight"));

            return new BMICalculator(feet, inches, weight);
        }

        public void setBMI(HttpServletRequest request){
            request.setAttribute("bmi", this.bmiResult);
        }

        /**
         * Determines BMI based on height and weight.
         * @param feet height in feet
         * @param inches height in inches
         * @param weight weight in pounds
         * @return BMI and BMI category
         */
        public String getBMI(int feet, int inches, int weight){
            if (feet < 0 || inches < 0 || weight < 0) return "Negative values are not accepted";
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
    }

    private static class RetirementCalculator {

        int currentAge;
        int salary;
        int percentSaved;
        int savingsGoal;

        String retirementResult;

        public RetirementCalculator(int currentAge, int salary, int percentSaved, int savingsGoal){
            this.currentAge = currentAge;
            this.salary = salary;
            this.percentSaved = percentSaved;
            this.savingsGoal = savingsGoal;
            this.retirementResult = checkRetirement(currentAge, salary, percentSaved, savingsGoal);
        }

        public static RetirementCalculator fromRequestParameters(HttpServletRequest request){

            int currentAge = Integer.parseInt(request.getParameter("currentAge"));
            int salary = Integer.parseInt(request.getParameter("salary"));
            int percentSaved = Integer.parseInt(request.getParameter("percentSaved"));
            int savingsGoal = Integer.parseInt(request.getParameter("savingsGoal"));

            return new RetirementCalculator(currentAge, salary, percentSaved, savingsGoal);
        }

        public static RetirementCalculator fromValues(int age, int salary, int percentSaved, int savingsGoal){
            return new RetirementCalculator(age, salary, percentSaved, savingsGoal);
        }

        public void setRetirementResult(HttpServletRequest request){
            request.setAttribute("retirement", this.retirementResult);
        }

        /**
         * Input user's current age, annual
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
            if (currentAge < 0 || salary < 0 || percentSaved < 0 || savingsGoal < 0) return "Negative values are not allowed.";
            int age = getRetirementAge(currentAge, salary, percentSaved, savingsGoal);
            System.out.println(age);
            if (age >= 100) {
                return "Retirement goal could not be met.";
            }
            return "Retirement goal will be met at age: " + age;
        }
    }
}
