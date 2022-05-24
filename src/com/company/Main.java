package com.company;

import com.company.startupSet.*;
import com.company.data.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean gameOn = false;

        Owner owner = new Owner();
        owner.setName();
        Time time = new Time();

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
        System.out.println(owner.name);


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

        Plants marchew = new Plants(50.0, 15, 30.0, 5.0, 50.0,5.0, 10);

        System.out.println(owner.cash);
        owner.plants = marchew;

        do {

            time.time();
            owner.farm.groundBuy();
            owner.farm.buildingBuy();

        } while (
                gameOn &&
                owner.farm.farmSize >= 20
        );


    }
}

