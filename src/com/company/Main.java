package com.company;

public class Main {

    public static void main(String[] args) {

        Garden<Double, Integer> garden1 = new Garden<>(3);
        System.out.println("В первом огороде полито " + garden1.quantityOfGardenBeds + " грядки" +
                " и использованно " + garden1.waterTheFlower(20.5) + " литров воды");

        Garden<Double, Integer> garden2 = new Garden<>(5);
        System.out.println("Во втором огороде полито " + garden2.quantityOfGardenBeds + " грядок" +
                " и использованно " + garden2.waterTheFlower(30.5) + " литров воды");
    }
}
