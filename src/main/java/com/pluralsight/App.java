package com.pluralsight;

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] quotes = {
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "Do something today that your future self will thank you for.",
                "Hard work beats talent when talent doesn’t work hard.",
                "Don’t watch the clock; do what it does. Keep going.",
                "Dream big and dare to fail.",
                "Push yourself, because no one else is going to do it for you.",
                "Great things never come from comfort zones.",
                "Discipline is doing what needs to be done, even when you don’t want to do it.",
                "Stay consistent. Results will come.",
                "Your only limit is your mind."
        };


        System.out.println("Please enter the number between 1 and 10 ");
        int quoteNumber = input.nextInt();
        int quoteIndex = quoteNumber -1;

        try {
            System.out.println(quotes[quoteIndex]);
        } catch (Exception e) {
            System.out.println("You chose an invalid number ");
        }


    }
}
