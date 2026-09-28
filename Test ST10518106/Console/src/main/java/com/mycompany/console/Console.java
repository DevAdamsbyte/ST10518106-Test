/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.console;

/**
 *
 * @author emeris
 */
import java.util.*;

public class Console 
{
    String consoleType;
    String storeName;
    int sales;
    
    public Console (String ct, String sn, int sl)
    {
        consoleType = ct;
        storeName = sn;
        sales = sl;
    }
    

    public String getConsoleType() {
        return consoleType;
    }


    public String getStore() {
        return storeName;
    }


    public int getTotalSales() {
        return sales;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Electronics Store Sales Entry");

        // Get Store Name
        System.out.print("Enter the store name: ");
        String storeName = scanner.nextLine();

        System.out.println("Select ConsoleType:");
        System.out.println("1. PS5");
        System.out.println("2. Xbox");
        System.out.println("3. Switch");
        System.out.print("Enter selection (1-3): ");

        int selection = scanner.nextInt();

        String consoleType;
        switch (selection) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "Xbox";
                break;
            case 3:
                consoleType = "Switch";
                break;
    }
}
