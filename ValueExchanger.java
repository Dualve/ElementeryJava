package com.company;

class ValueExchanger {

    static void Change(double firstElement, double secondElement) {
        firstElement = firstElement / secondElement;
        secondElement = firstElement * secondElement;
        firstElement = secondElement/firstElement;
        ValueExchanger.print(firstElement,secondElement);
    }

    private static void print(double firstElement, double secondElement){
        System.out.println("first - " + firstElement + " second - " + secondElement + ".\n");
    }
}
