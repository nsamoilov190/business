import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(actual, expected);
    }

    @Test
    public void findMaxsecondopt() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 34, 8, 6, 11, 11, 12};
        long expected = 34;

        long actual = service.findMax(incomesInBillions);

        assertEquals(actual, expected);
    }

    @Test
    public void findMaxthirdopt() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 34, 8, 6, 11, 11, 56};
        long expected = 56;

        long actual = service.findMax(incomesInBillions);

        assertEquals(actual, expected);
    }
}