public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected1 = 30;
        long amount1 = 1_000;
        boolean isRegistered1 = true;
        int actual1 = service.calcBonus(amount1, isRegistered1);
        System.out.println("1. " + expected1 + " == ? == " + actual1);

        int expected2 = 500;
        long amount2 = 1_000_000;
        boolean isRegistered2 = false;
        int actual2 = service.calcBonus(amount2, isRegistered2);
        System.out.println("2. " + expected2 + " == ? == " + actual2);
    }
}
