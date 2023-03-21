package ru.netology.services;
public class HolidayCalculationService {
    public int calculate(int income, int expenses, int threshold) {
        int vacationCount = 0; // Счетчик месяцев
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            // money = income - expenses // Расчет денег на счету
            if (money >= threshold) { // Если сумма больше нужной, есть возможность отдыха
                vacationCount++; // расчет месяцев отдыха
                money = (money - expenses)/3; // расчет денег на счету
            } else {
                money = money + income - expenses;
            }
        }
        return vacationCount;
}
}
