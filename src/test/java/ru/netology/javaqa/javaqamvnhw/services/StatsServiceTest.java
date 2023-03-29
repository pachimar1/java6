package ru.netology.javaqa.javaqamvnhw.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldFindTotalSales() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 180;
        double totalSales = service.calculateTotalSales(sales);

        Assertions.assertEquals(expected, totalSales);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 15;
        double averageSales = service.calculateAverageSales(sales);

        Assertions.assertEquals(expected, averageSales);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int maxSales = service.findMaxSalesMonth(sales);

        Assertions.assertEquals(expected, maxSales);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int minSales = service.findMinSalesMonth(sales);

        Assertions.assertEquals(expected, minSales);
    }

    @Test
    public void shouldFindCountMonthBelowAverage() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.CountBelowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCountMonthAboveAverage() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.CountAboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}

