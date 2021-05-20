package greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Greet greet = new Greet();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Select Option");
        int selection = sc.nextInt();

        greet.greetPerson(name,selection);

        System.out.println("Type 'Help' for the menu");

    }
}
