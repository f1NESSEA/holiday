package re.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.HolidayCalculationService;

public class HolidayCalculationServiceTest {
    @Test
    public void WhenStartHoliday() {
        HolidayCalculationService service = new HolidayCalculationService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
