package com.company.startupSet;

import java.util.*;

import com.company.data.Plants;
import com.company.data.Transactions;

public class Owner implements Transactions {
    public String name;
    public double cash = 25000;
    public Farm farm;
    public Plants plants;
    public Integer[] ownerPlants = {0, 0, 0};
    public Integer[] ownerAnimals = {0, 0, 0};

    public void setName() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("witaj rolniku");
        System.out.println("podaj imie");
        this.name = myObj.nextLine();

    }

    public void setFarm(Farm farm) {
        this.farm = farm;
        this.cash = cash - farm.farmPrice;
    }

    public void farmSelect() {
        System.out.println("witaj rolniku " + this.name +" wpisz w konsole numer farmy ktora chcesz kupic");
        System.out.println("farma numer 1 wpisz - '1' ");
        System.out.println("farma numer 2 wpisz - '2' ");
        System.out.println("farma numer 3 wpisz - '3' ");
        }

    public void setPlant(Plants plants) {
        this.plants = plants;

    }

    @Override
    public void buy() {
        System.out.println("wybierz co chcesz kupic");
        System.out.println("1 - zwierzeta");
        System.out.println("2 - rosliny");
        Scanner setGame = new Scanner(System.in);
        switch (setGame.nextInt()) {
            case 1:
                if(this.cash > plants.feedCost) {
                    setPlant(plants);
                    this.cash = this.cash - plants.feedCost;
                    ownerPlants[0]++;
                } else {
                    System.out.println("nie stać Cie na zakup");
                }
                System.out.println(this.cash);
                System.out.println(ownerPlants[0]);

                break;
            case 2:
                System.out.println("zakup zwierzat lub roslin");
                break;
        }
    }

    @Override
    public void sell() {

    }
}


