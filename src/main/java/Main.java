import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService calculator = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int vacationMonths = calculator.calculate(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха в следующем году: " + vacationMonths);
    }
}