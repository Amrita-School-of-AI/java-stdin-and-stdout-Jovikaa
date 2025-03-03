package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers:"); 

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("You entered:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }
}
