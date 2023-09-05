package ru.netology.services;
public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int months = 0;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            String str = "Месяц "+month+".";

            if (savings >= threshold) {
                months++;
                savings -= expenses;
                int extra = savings - (savings / 3);
                savings = savings - extra;
                str = str + " Буду отдыхать. Потратил -"+expenses+", затем ещё -"+extra;
            } else {
                savings += income;
                savings -= expenses;
                str = str + " Придётся работать. Заработал +"+income+", потратил -"+expenses;
            }
            System.out.println(str);
        }

        return months;
    }
}
