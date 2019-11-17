package com.company;

class ConvertеrOfDistance {

    static void convertToMeters(double distance){
        int DIVIDER_M = 100;
        ConvertеrOfDistance.printM(distance/DIVIDER_M);
    }

    static void convertToKilometers(double distance){
        int DIVIDER_KM = 100_000;
        ConvertеrOfDistance.printKM(distance/DIVIDER_KM);
    }

    static private void printM(double distance){
        System.out.println(distance + " - distance in M");
    }

    static private void printKM(double distance){
        System.out.println(distance + " - distance in KM");
    }

}
