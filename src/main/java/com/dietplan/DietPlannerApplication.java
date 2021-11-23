package com.dietplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DietPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DietPlannerApplication.class, args);
        com.dietplan.BMICalc BMI = new com.dietplan.BMICalc();
        com.dietplan.FitCalc HIndex = new com.dietplan.FitCalc();
        BMI.bmiCalc();
        com.dietplan.FitCalc.FitCalc();

    }

}
