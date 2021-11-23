package com.dietplan;

import com.dietplan.gui.guiFrameMain;

import java.util.Objects;
import java.util.Scanner;
/*Itt egy saját pontrendszer kerül bevezetésre, hiszen a BMI az nem mér fittségi szintet, és nem mérvadó ha valakin
egy deka izom is. A következőkben bevezetünk egy olyan változót hogy HIndex. Minél magasabb, annál fittebb valaki.
Nyilván ezekhez rendes orvosi vizsgálat szükséges, de ennek híján marad ez.
 */

public class FitCalc extends guiFrameMain {
    public static double HIndex;
    public static String fitChange;
    public static double Calories;
    public static double Protein;
    public static double ProteinCal;
    public static double Fat;
    public static double FatCal;
    public static double Carbs;
    public static double CarbsCal;
    public static String Nutrition;
    public static void FitCalc() {

        guiFrameMain gui = new guiFrameMain();

        double fitbmi = gui.guiBMI; // BMI guiból
        fitbmi = Math.round(fitbmi * 100.0) / 100.0; //lekerekítjük a BMI-t hogy ne legyen undorító


        int age = gui.guiAge; // Életkor guiból
       String fitChange = gui.guiFitChange; //fitChange guiból
       double exInt = gui.guiExInt;  //exint guiból
        String fitGender = gui.guiGender; //gender guiból

        HIndex = fitbmi + exInt*1.2; // így jön ki a HIndex


        if(age<=21){
            Calories+=400;
        }

        Calories = HIndex * 0.5*1000;
        Calories = Math.round(Calories * 100.0) / 1000;

        Calories = Calories - (age * 8 ); // Ahogy öregszünk csökken a metabolizmusunk és kevesebbet kell ennünk
        if(Objects.equals(fitGender,"N")){ //Nem, a nőknek nem kell több kalória, csak más az elfogadhatóbb tartomány, ezért +100Cal
            Calories+=100;
        }
        Calories+= 400;
        if (Objects.equals(fitChange, "E")) { // 40% fehérje, 30% zsír, 30% szénhidrát
            Calories += 500; //mert kell a tömeg

            ProteinCal = Calories * 0.4;
            CarbsCal = Calories * 0.3;
            FatCal = Calories * 0.3;

            Protein = ProteinCal / 4;
            Carbs = CarbsCal / 4;
            Fat = FatCal / 9;

            Carbs = Math.round(Carbs*100) / 100;
            Fat = Math.round(Fat*100) / 100;
            Protein = Math.round(Protein*100) / 100;
            Nutrition = String.format("Kalória: %s\nProtein: %s\nSzénhidrát: %s\nZsírok: %s\n",Calories,Protein,Carbs
            ,Fat);

        }
        if (Objects.equals(fitChange, "F")) {

            ProteinCal = Calories * 0.4;
            CarbsCal = Calories * 0.2;
            FatCal = Calories * 0.4;

            Protein = ProteinCal / 4;
            Carbs = CarbsCal / 4;
            Fat = FatCal / 9;

            Carbs = Math.round(Carbs*100) / 100;
            Fat = Math.round(Fat*100) / 100;
            Protein = Math.round(Protein*100) / 100;

            Nutrition = String.format("Kalória: %s\nProtein: %s\nSzénhidrát: %s\nZsírok: %s\n",Calories,Protein,Carbs
                    ,Fat);

        }

    }
}

