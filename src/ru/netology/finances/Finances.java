package ru.netology.finances;

public class Finances {
    public static int calcPayment(int start, int amount, int years){
        int monthlyPayment = (amount - start) / (years * 12);
        return monthlyPayment;
    }
}
