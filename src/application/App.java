package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        double age = scanner.nextDouble();

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
