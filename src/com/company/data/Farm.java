package com.company.data;

import java.util.*;

public class Farm {
    public Integer farmSize;
    public Integer buildings;

    public void randomFarmGen(){
        Random r = new Random();
        farmSize = r.nextInt(25, 50);
        buildings = r.nextInt(5);
        System.out.println("twoja farma ma: " + this.farmSize + " hektarow");
        System.out.println("oraz posiada: " + this.buildings + " budynki gospodarcze");
    }
}
