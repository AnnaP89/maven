public class BonusService {
    public int calcBonus(long amount, boolean isRegistered) {
        int percent = isRegistered ? 3 : 1;
        int bonus = Math.toIntExact(amount * percent / 100);
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
