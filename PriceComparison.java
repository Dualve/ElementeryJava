package com.company;

class PriceComparison {

    static private double getPriceForOneKg(double price, double amount){
        return price/amount;
    }

    static  private void printM(double price){
        System.out.printf("1 kg of marmalade cost - %.3f .\n", price);
    }

    static  private void printC(double price){
        System.out.printf("1 kg of chocolate cost - %.3f .\n", price );
    }

    static private void printDifference(double difference){
        System.out.printf("Difference between prices is - %.3f .\n", difference);
    }

    static void printInfo(boolean info){
        if(info){
            System.out.println("1 kg of chocolate cost more then 1 kg of marmalade.");
        }
        else{
            System.out.println("1 kg of marmalade cost more then 1 kg of chocolate.");
        }
    }

    static boolean compare(double priceChoc, double priceMarm, double amountChoc, double amountMarm){
        double priceForKgMarm = getPriceForOneKg(priceMarm, amountMarm);
        double priceForKgChoc = getPriceForOneKg(priceChoc, amountChoc);
        printC(priceForKgChoc);
        printM(priceForKgMarm);
        printDifference(priceForKgChoc - priceForKgMarm);
        return priceForKgChoc > priceForKgMarm;
    }
}
