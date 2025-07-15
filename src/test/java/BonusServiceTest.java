import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Nested
    class bonusServiceTest {

        @Test
        public void shouldCalculateForRegisteredAndUnderLimit() {
            BonusService service = new BonusService();
            // подготавливаем данные:
            int amount = 1000;
            boolean registered = true;
            int expected = 30; // 1000*3% = 30

            // вызываем целевой метод:
            long actual = service.calcBonus(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldCalculateForRegisteredAndOverLimit() {
            BonusService service = new BonusService();
            // подготавливаем данные:
            int amount = 1_000_000;
            boolean registered = true;
            int expected = 500;

            // вызываем целевой метод:
            long actual = service.calcBonus(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
    }
}