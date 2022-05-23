package com.company;

import com.company.startupSet.Farm;
import com.company.startupSet.Owner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.setName();

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
        Scanner myObj = new Scanner(System.in);
        switch (myObj.nextInt()) {
            case 1:
                System.out.println("wybrales farme nr.1");
                owner.setFarm(farm1);
                break;
            case 2:
                System.out.println("wybrales farme nr.2");
                owner.setFarm(farm2);
                break;
            case 3:
                System.out.println("wybrales farme nr.2");
                owner.setFarm(farm3);
                break;
        }

        System.out.println(owner.cash);
                /* do {

        } while (

        ); */


    }
}

