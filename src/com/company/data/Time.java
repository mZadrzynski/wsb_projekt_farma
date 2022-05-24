package com.company.data;

import com.company.startupSet.*;


public class Time {
    public Integer year = 2020;
    public Integer week = 0;
    public Owner owner;

    public void time() {
        this.week++;
        if (this.week > 52) {
            this.year++;
        }
        System.out.println("Dzisiaj mamy: " + this.year + " tydzien: " + this.week);
    }

    public void runGame() {
        System.out.println("wybierz co chcesz zrobic!");
        System.out.println("1 - zakup ziemi lub bydunkow");
        System.out.println("2 - zakup zwierzat lub roslin");
        System.out.println("3 - zasiewroslin");
        System.out.println("4 - zbior roslin");
        System.out.println("5 - sprzedaz roslin lub zwierzat");
        System.out.println("6 - sprawdzenie stanu zapasow");
        System.out.println("7 - sprawdzenie stanu zwierzat");
        System.out.println("8 - sprawdzenie stanu posiadanych roslin i sadzonek");
        System.out.println("9 - przejdz do nastepnego tygodnia");
    }

    public void gameConversion() {

    }
}
