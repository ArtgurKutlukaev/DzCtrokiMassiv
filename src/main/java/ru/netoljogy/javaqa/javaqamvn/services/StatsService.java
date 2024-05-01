package ru.netoljogy.javaqa.javaqamvn.services;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }


    public int monthMaxSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] <= sales[i]) {
                month = i;

            }
        }
        return month + 1;
    }

    public int monthMinSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] >= sales[i]) {
                month = i;

            }
        }
        return month + 1;
    }

    public int montSalesAreBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int montSalesAreAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}