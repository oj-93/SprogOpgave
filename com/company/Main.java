package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Dialog dialog = new English();

        Sprog sprog = new Sprog();

        while (!getString(dialog.quit()).equalsIgnoreCase("q")) {


            if (getString("press y to change language").equalsIgnoreCase("y")) {

                dialog = sprog.SkiftSprog(getString("da / eng / svk / fnsk / por"));
            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());
            System.out.println("The capital is " + dialog.getCapital());
            System.out.println("The population of the country is " + dialog.getPopulation());
        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();
    }
}
