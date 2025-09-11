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
                HelloWorld();
                break;
            case "2":
                Numbers();
                break;
            case "3":
                onOff = false;
            }
        }
    }

    public static void HelloWorld() {
        HelloWorld.helloWorldLook();
    }

    public static void Numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1: Max
                2: DoubleMax
                3: Name""");

        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                Numbers.Max();
                break;
            case "2":
                Numbers.DoubleMax();
                break;
            case "3":
                Numbers.Name();
                break;
        }
    }
}
