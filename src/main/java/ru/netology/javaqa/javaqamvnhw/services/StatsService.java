package ru.netology.javaqa.javaqamvnhw.services;

public class StatsService {

    public double calculateTotalSales(double[] sales) {
        int sum = 0;
        for (double sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverageSales(double[] sales) {
        double totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    public int findMaxSalesMonth(double[] sales) {
        int maxMonth = 0;
        double maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int findMinSalesMonth(double[] sales) {
        int minMonth = 0;
        double minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int CountBelowAverageSales(double[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (double sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int CountAboveAverageSales(double[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (double sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}


