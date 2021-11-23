package com.dietplan;

import java.util.Scanner;

public class BMICalculator {

    public static double calculate(double weight, double height){
        height = Math.pow(height * 0.01,2);
        return weight / height;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány cm vagy?");
        int height = scanner.nextInt(); //itt bekerül a magasság
        System.out.println(height);
        System.out.println("Hány kg vagy?");
        int weight = scanner.nextInt();
        double BMI = calculate(weight, height);
        System.out.println(BMI + " a BMI-d");


    }


}
