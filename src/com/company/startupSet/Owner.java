package com.company.startupSet;

import java.util.*;
import com.company.startupSet.Farm;
import com.company.data.Plants;

public class Owner {
    public String name;
    public Integer cash = 25000;
    public Farm farm;
    public Plants plants;

    public void setName() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("podaj imie");
        this.name = myObj.nextLine();

    }

    public void setFarm(Farm farm) {
        this.farm = farm;
        this.cash = cash - farm.farmPrice;
        }

    public void farmSelect() {
        System.out.println("witaj rolniku" + this.name +"wpisz w konsole numer farmy ktora chcesz kupic");
        System.out.println("farma numer 1 wpisz - '1' ");
        System.out.println("farma numer 2 wpisz - '2' ");
        System.out.println("farma numer 3 wpisz - '3' ");
        }
}

