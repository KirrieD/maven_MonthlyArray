package ru.netology.services;

public class StatsService {
    public long sumSales(@org.jetbrains.annotations.NotNull long [] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averagSale (long[] sales){
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int minMountSales(int [] sales) {
        int minMounth = 0;

        int i;
        for (i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMounth]) {
                minMounth = i;
            }
        }
        return minMounth + i;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int salesBelowAvg(long[] sales) {
        long avg = averagSale(sales);
        long months = 0;
        for (long sale : sales) {
            if (sale < avg) {
                months++;
            }
        }
        return (int) months;
    }
    public int salesAboveAvg(long[] sales) {
        long avg = averagSale(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > avg) {
                months++;
            }
        }
        return months;
    }
}