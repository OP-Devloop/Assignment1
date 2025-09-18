package se.iths.oscarp;

import java.util.Scanner;

public class HelloWorld {

    //boolean is the same for all because of volatile
    private static volatile boolean running = true;

    public static void helloWorldLook() {
        String[] helloWorld = {"Hello", "World", "!"};

        // Looking for the ENTER key
        Thread inputThread = new Thread(()->{
            Scanner sc = new Scanner(System.in);
            while(running){

                // Scanner is looking for input
                String input = sc.nextLine();

                // If scanner see's ENTER (ENTER = isEmpty() = "") set running to false
                if(input.isEmpty()){
                    running = false; // Stop loop
                }
            }
        });

        // Starts inputThread to start looking for the ENTER key
        inputThread.start();

        while(running) {

            System.out.print(helloWorld[0]);
            System.out.print(" " + helloWorld[1]);
            System.out.print(" " + helloWorld[2]);
            System.out.print("\n");

            try {
                Thread.sleep(400); // time between
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

