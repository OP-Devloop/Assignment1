package se.iths.oscarp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean onOff = true;

        while (onOff) {
            System.out.println("""
                    1: Hello World!
                    2: Numbers
                    3: Exit""");

            String choice = sc.nextLine();

            switch (choice) {
            case "1":
                helloWorld();
                break;
            case "2":
                numbers();
                break;
            case "3":
                onOff = false;
            }
        }
    }

    public static void helloWorld() {
        HelloWorld.helloWorldLook();
    }

    public static void numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1: Max
                2: DoubleMax
                3: Name""");

        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                Numbers.max();
                break;
            case "2":
                Numbers.doubleMax();
                break;
            case "3":
                Numbers.name();
                break;
        }
    }
}
