package com.company.data;
import java.util.Scanner;


public class Engine {
    public Boolean userInput;

    Scanner read = new Scanner(System.in);

    Boolean userInput() {
        System.out.println("czy chcesz przejść dalej?");
        if (read.nextLine() == "y") {
            return userInput = true;
        } else {
            return userInput = false;
        }
    }

}
