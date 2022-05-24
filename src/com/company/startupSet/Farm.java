package com.company.startupSet;
import com.company.Main;
import java.util.*;

public class Farm {
    public Integer farmSize;
    public Integer buildings;
    public Integer farmPrice;
    public Owner owner;
    public Integer hectarePrice;


    public void randomFarmGen() {
        Random r = new Random();
        farmSize = r.nextInt(2, 5);
        buildings = r.nextInt(2);
        farmPrice = (farmSize * 2000) + (buildings * 5000);
        System.out.println("farma ma: " + this.farmSize + " hektarow oraz posiada: " + this.buildings + " budynki gospodarcze");
        System.out.println("cena tej farmy to: " + farmPrice + " cebulionow");
    }

    public void groundBuy() {
        System.out.println("czy chcesz kupic ziemie");

    }

    public void buildingBuy() {


    }

}




