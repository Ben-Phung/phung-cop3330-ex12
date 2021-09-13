/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt input
        System.out.println("Enter the principal: ");
        String Principal = scan.nextLine();

        System.out.print( "Enter the rate of interest: " );
        String Rate = scan.nextLine();

        System.out.print( "Enter the number of years: " );
        String Years = scan.nextLine();

        // Convert strings to double
        double dPrincipal = Double.parseDouble(Principal);
        double dRate = Double.parseDouble(Rate);
        double dYears = Double.parseDouble(Years);

        // Calculations
        double interest = dRate / 100;
        double total = dPrincipal * (1+(interest * dYears));

        // Output formatted as money using 2 decimal places
        System.out.println( "After "+dYears+" years at "+dRate+"%, the investment will be worth $"+String.format("%.2f",total)+"." );
    }
}
