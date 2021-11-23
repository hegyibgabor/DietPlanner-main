package com.dietplan;

public class Main {
    public static void main(String[] args) {
        BMICalc BMI = new BMICalc();
        FitCalc HIndex = new FitCalc();

        BMI.enterGender();
        BMI.enterHeight();
        BMI.enterWeight();
        BMI.enterAge();
        BMI.bmiCalc();
        FitCalc.FitCalc();
    }
}
