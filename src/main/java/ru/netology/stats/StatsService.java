package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSum = sum / sales.length;
        return averageSum;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberOfMonthsUnderAverage(int[] sales) {
        int counterMonth = 0;
        int averageSale = findAverage(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                counterMonth++;
            }
        }
        return counterMonth;
    }

    public int numberOfMonthsOverAverage(int[] sales) {
        int counterMonth = 0;
        int averageSale = findAverage(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                counterMonth++;
            }
        }
        return counterMonth;
    }
}
