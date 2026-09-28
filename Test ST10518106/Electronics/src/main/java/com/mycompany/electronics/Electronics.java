/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronics;

/**
 *
 * @author emeris
 */

import java.util.*;

public class Electronics 
{

    public static void main(String[] args) 
    {
        String[] consoleName = {"PS5", "XBOX", "SWITCH"};
        
        String[] cityName = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        int[][] sales =
        {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        for(String y : consoleName)
        {
            System.out.printf(y);
        }
        
        System.out.println("=======================================");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("=======================================");
        
        for (int i = 0; i < cityName.length; i++) {
            System.out.printf(cityName[i]);
            int cityTotal = 0;

            for (int j = 0; j < consoleName.length; j++) {
                System.out.print(sales[i][j]);
                cityTotal += sales[i][j];
            }
        }
        
        System.out.println("=======================================");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("=======================================");
        
        int[] cityTotals = new int[cityName.length];
        
        for (int i = 0; i < cityName.length; i++) {
            System.out.println(" - " + cityName[i] + ": " + cityTotals[i]);
        }

        
    }
}