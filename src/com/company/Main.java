package com.company;

import com.company.startupSet.*;
import com.company.data.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean gameOn = true;

        Owner owner = new Owner();
        owner.setName();
        Time time = new Time();

        time.time();
        System.out.println("podaj ktora farme chcesz zakupic");
        System.out.println("farma numer 1");
        Farm farm1 = new Farm();
        farm1.randomFarmGen();
        System.out.println("farma numer 2");
        Farm farm2 = new Farm();
        farm2.randomFarmGen();
        System.out.println("farma numer 3");
        Farm farm3 = new Farm();
        farm3.randomFarmGen();

        owner.farmSelect();
        Scanner setFarm = new Scanner(System.in);
        switch (setFarm.nextInt()) {
            case 1:
                System.out.println("wybrales farme nr.1");
                owner.setFarm(farm1);
                break;
            case 2:
                System.out.println("wybrales farme nr.2");
                owner.setFarm(farm2);
                break;
            case 3:
                System.out.println("wybrales farme nr.3");
                owner.setFarm(farm3);
                break;
        }
        System.out.println("zostało Ci " + owner.cash);

        Plants marchew = new Plants(50.0, 15, 30.0, 5.0, 50.0,5.0, 10);
        Plants rzodkiew = new Plants(50.0, 15, 30.0, 5.0, 50.0,5.0, 10);

        String plants[] = {String.valueOf(marchew), String.valueOf(rzodkiew)};


        do {
            time.runGame();
            Scanner setGame = new Scanner(System.in);
            switch (setGame.nextInt()) {
                case 1:
                    owner.farm.groundBuy();
                    break;
                case 2:
                    System.out.println("zakup zwierzat lub roslin");
                    break;
                case 3:
                    owner.plants.seed();
                    break;
                case 4:
                    System.out.println("zbior roslin");
                    break;
                case 5:
                    System.out.println("sprzedaz zwierzat lub roslin");
                    break;
                case 6:
                    System.out.println("sprawdzenie stanu zapasow");
                    break;
                case 7:
                    System.out.println("sprawdzenie stanu zwierzat");
                    break;
                case 8:
                    System.out.println("sprawdzenie stanu posiadanych roslin i sadzonek");
                    break;
                case 9:
                    time.time();
                    time.gameConversion();
                    break;
            }
        } while (
                gameOn
        );
    }
}

