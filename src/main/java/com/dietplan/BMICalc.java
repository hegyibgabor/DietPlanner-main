package com.dietplan;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//BMI kiszámítás az első lépés az egész projektben.
public class BMICalc extends Main {

    public static double BMI;
    public static String Gender;
    public static int age;
    public static int height;
    public static int weight;

    public static double calculate(double weight, double height){
        height = Math.pow(height * 0.01,2);
        return weight / height;
    }

    public String enterGender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Milyen nemű vagy? F/N");
        Gender = scanner.nextLine();
        Gender = Gender.toUpperCase(Locale.ROOT);
            if(Gender.equals("F") || Gender.equals("N")) {
                Gender = this.Gender;
                return Gender;
            }
            else {
                System.out.println("Nem megfelelő válasz");
                return enterGender();
            }
    }


    public int enterHeight(){ //valójában a súlyt rögzíti
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány kg vagy?");

        int height = scanner.nextInt();
            if (height > 0 && height <= 272){
                this.height = height;
                return height;
        }
            else {
                System.out.println("Nem megfelelő válasz");
                return enterHeight();
            }
    }

    public int enterWeight(){ //valójában a súlyt rögzíti
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány centiméter vagy?");

        int weight = scanner.nextInt();
        if (weight <= 0 && weight > 635){
            System.out.println("Valós adatot adj meg!");
            return enterWeight();
        }
        else {
            this.weight = weight;
            return weight;
        }
    }

        public int enterAge(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hány éves vagy?");
            int age = scanner.nextInt();
            if(age > 0 && age <= 115){
                this.age = age;
                return age;
            }
            else {
                System.out.println("Valós életkort adj meg!");
                return enterAge();
            }
        }


        public void bmiCalc() {
            double BMICalcul = calculate(height, weight);
            BMI = BMICalcul;
        }


    public double getBMI() {
        return BMI;
    }
    public String getGender(){
        return Gender;
    }
    public int getAge(){
        return age;
    }
}
