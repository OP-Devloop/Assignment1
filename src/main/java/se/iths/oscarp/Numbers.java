package se.iths.oscarp;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Numbers {
    static Scanner sc = new Scanner(System.in);

    // Privata Stringar till Name metoden
    private static String firstName;
    private static String lastName;

    public static void max() {
        // The numbers to check
        int[] numbers = {22, 4, 7, 19, 1, 30};
        // Max starts as 0
        int max = numbers[0];

        // Loop this for as many numbers there are
        for (int i = 1; i < numbers.length; i++){
            // If number is bigger than max then make max that number
            if (numbers[i] > max){
                max = numbers[i];
            }

        }
        System.out.println("Biggest number is: " + max);
    }
    public static void doubleMax() {
        double one = 0;
        double two = 0;
        // Boolean to check if input is valid
        boolean valid = false;



        // Så länge valid är inte true
        while (!valid) {

            System.out.println("First number: ");
//            one = sc.nextDouble();

            // letar efter Double
            try {
                one = sc.nextDouble();

                // Om input inte är Double gör det här
            } catch (InputMismatchException e) {
                String invalid = sc.nextLine();
                System.out.println(invalid + " is not a valid number");
                return;
            }

            System.out.println("Second number: ");
//            two = sc.nextDouble();

            // letar efter Double igen
            try {
                two = sc.nextDouble();
                // sätter Boolean valid to true så att den inte loopar
                valid = true;

                // Om input inte är Double gör det här
            } catch (InputMismatchException e) {
                // Fånga upp fel input
                String invalid = sc.nextLine();
                System.out.println(invalid + " is not a valid number");
                return;
            }
        }
        // Om One är störe än Two gör det här
        if  (one > two){
            System.out.println("Biggest number is: " + one);
        }
        // Annars gör det här
        else {
            System.out.println("Biggest number is: " + two);
        }
        // Om One och Two är samma gör det här
        if  (one==two){
            System.out.println("Both numbers are equal");
        }
    }
    public static void name() {

        // Anropar Object firstName
        firstName();

        // Anropar Object lastName
        lastName();

        // Skriver ut Full Name
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    // Object för att få firstName
    public static void firstName() {
        System.out.print("Please enter First name: ");
        firstName = sc.next();

        // retunera till firstName anropet
    }

    // Object för att få lastName
    public static void lastName() {
        System.out.print("Please enter Last name: ");
        lastName = sc.next();

        // retunera till lastName anropet
    }
}
