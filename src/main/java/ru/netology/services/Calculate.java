package ru.netology.services;

public class Calculate {
    public int calculate(int income, int expenses, int threshold) {
        int countMonth = 0;
        int money = 0;

        for (int i = 0; i <= 11; i++) {
            if (money >= threshold) {
                //отдых
                money = money - expenses;
                money = money / 3;
                countMonth++;
            } else {
                //работать
                money = money + income - expenses;

            }
        }
        return countMonth;
    }
}
