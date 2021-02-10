package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dialog dialog = new English();
       

        Sprog sprog = new Sprog();
        String quit = null;
        String a;
        while (quit != "Quit") {

            switch (a = getString("dit valg")) {

            case "Capital":
                System.out.println("The capital is " + dialog.getCapital());
                break;

            case "Population":
                System.out.println("The population of the country is " + dialog.getPopulation());
                break;

            case "Change":
                dialog = sprog.SkiftSprog(getString("da / eng / svk / fnsk / por"));
                break;

            case "Current":
                System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());
                break;

            case "Quit":
                quit = "Quit";
                break;
        }



        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();
    }
}
