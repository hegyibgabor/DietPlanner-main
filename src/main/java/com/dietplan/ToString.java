package com.dietplan;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToString {


    public static String ToString(ArrayList<String> minta){
        StringBuilder str = new StringBuilder("");
        for (String eachstring : minta) {

            // Each element in ArrayList is appended
            // followed by comma
            str.append(eachstring).append(",");
        }

        // StringBuffer to String conversion
        String commaseparatedlist = str.toString();

        // Condition check to remove the last comma
        if (commaseparatedlist.length() > 0)

            commaseparatedlist = commaseparatedlist.substring(0, commaseparatedlist.length() - 1);
        return commaseparatedlist;
    }



}
