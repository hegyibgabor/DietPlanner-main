package com.dietplan;

import com.dietplan.entity.breakfast;

import java.util.*;
import java.sql.*;

public class mealPlan extends FitCalc {

    public static List<String> breakfast1 = new ArrayList<String>();
    public static List<String> brunch1 = new ArrayList<String>();
    public static List<String> lunch1 = new ArrayList<String>();
    public static List<String> afternoon1 = new ArrayList<String>();
    public static List<String> dinner1= new ArrayList<String>();

    public static void MealMaker() {
        String databaseURL = "jdbc:sqlite:src/main/resources/Food.db";
        try (Connection connection = DriverManager.getConnection(databaseURL)) {

            Statement st = connection.createStatement();

            breakfast1.clear();
            brunch1.clear();
            lunch1.clear();
            afternoon1.clear();
            dinner1.clear();

            //első nap



            Calories = FitCalc.Calories;
            double CaloriesMin = Calories/5 - 100;
            double CaloriesMax = Calories/5 + 100;

            String Query = "Select * from breakfast WHERE calories BETWEEN '" + CaloriesMin + "' AND '" +
                    CaloriesMax + "'ORDER BY RANDOM() LIMIT 1";
            ResultSet rs = st.executeQuery(Query);

            //Reggeli1
            while(rs.next()) {
                breakfast1.add(rs.getString(2));
                breakfast1.add(rs.getString(3));
                breakfast1.add(rs.getString(4));
                breakfast1.add(rs.getString(5));
                breakfast1.add(rs.getString(6));
            }
            Query = "Select * from brunch WHERE calories BETWEEN '" + CaloriesMin + "'AND'"+ CaloriesMax +
                    "'ORDER BY RANDOM() LIMIT 1";
            rs = st.executeQuery(Query);
            while(rs.next()) {
                brunch1.add(rs.getString(2));
                brunch1.add(rs.getString(3));
                brunch1.add(rs.getString(4));
                brunch1.add(rs.getString(5));
                brunch1.add(rs.getString(6));
            }
            Query = "Select * from lunch WHERE calories BETWEEN '" + CaloriesMin + "'AND'"+ CaloriesMax +
                    "'ORDER BY RANDOM() LIMIT 1";
            rs = st.executeQuery(Query);
            while(rs.next()) {
                lunch1.add(rs.getString(2));
                lunch1.add(rs.getString(3));
                lunch1.add(rs.getString(4));
                lunch1.add(rs.getString(6));
                lunch1.add(rs.getString(5));
            }
            Query = "Select * from afternoon WHERE calories BETWEEN '" + CaloriesMin + "'AND'"+ CaloriesMax +
                    "'AND Calories != '" + brunch1.get(1) + "'ORDER BY RANDOM() LIMIT 1";
            rs = st.executeQuery(Query);
            while(rs.next()) {
                afternoon1.add(rs.getString(2));
                afternoon1.add(rs.getString(3));
                afternoon1.add(rs.getString(4));
                afternoon1.add(rs.getString(5));
                afternoon1.add(rs.getString(6));
            }
            Query = "Select * from dinner WHERE calories BETWEEN '" + CaloriesMin + "'AND'"+ CaloriesMax +
                    "'ORDER BY RANDOM() LIMIT 1";
            rs = st.executeQuery(Query);
            while(rs.next()) {
                dinner1.add(rs.getString(2));
                dinner1.add(rs.getString(3));
                dinner1.add(rs.getString(4));
                dinner1.add(rs.getString(5));
                dinner1.add(rs.getString(6));
            }
                System.out.println(breakfast1);
                System.out.println(brunch1);
                System.out.println(lunch1);
                System.out.println(afternoon1);
                System.out.println(dinner1);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }



}
