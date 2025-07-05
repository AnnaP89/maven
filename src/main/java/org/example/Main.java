package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int expected1 = 150;
        Object amount1 = 5_000;
        Object isRegistered1;
        int actual1 = service.calcBonus( amount1, 5000, isRegistered1);
        boolean b = true;
        System.out.println("1. " + expected1 + " == ? == " + actual1);

        int expected2 = 50;
        Object amount2 = 5_000;
        Object isRegistered2;
        int actual2;
        actual2 = service.calcBonus( amount2, 5000, isRegistered2);
        boolean b1 = false;
        System.out.println("2. " + expected2 + " == ? == " + actual2);
    }
}
