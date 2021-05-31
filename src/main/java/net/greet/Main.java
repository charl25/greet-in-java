package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Greet greet = new Greet();
        boolean exit = true;

        start : while(exit){
            System.out.println("Enter command or type 'help' for the menu");
            String selection = sc.nextLine();
            String [] input = selection.split(" ");
            switch (input[0]){
                case "help":
                    greet.help();
                    continue start;
                case "greeted":
                    if (input.length > 1) {
                        System.out.println(greet.greeted(input[1]));
                    }else{
                    greet.greeted();
                    }
                    continue start;
                case "clear":
                    if(input.length > 1){
                        greet.clear(input[1]);
                    }else{
                    greet.clear();
                    }
                    continue start;
                case "exit":
                    exit = false;
                    break;
                case "greet":
                    String lang=" ";
                    if(input.length>1){
                    if(input.length>2){
                        lang = input[2];
                    }
                    greet.greetPerson(input[1],lang);
                    }else{
                        System.out.println("Invalid command");
                    }
                    continue start;
                case "counter":
                    greet.counter();
                    continue start;
                default :
                    System.out.println("Invalid command");
                    continue start;
            }

        }


    }
}
