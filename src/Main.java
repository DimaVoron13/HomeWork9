public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int [] salary = {12_000, 8_000, 13_000, 7_000, 10_000};
        int allSalary = 0;
        for (int i : salary) {
            allSalary = allSalary + i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n", allSalary);

        System.out.println("Задание 2");

        int [] expenses = {12_000, 25_000, 13_000, 7_000, 10_000};
        int maxExpense = -1;
        int minExpense = Integer.MAX_VALUE;
        for (int number : expenses) {
            if (number > maxExpense) {
                maxExpense = number;
            }else if (number < minExpense) {
                minExpense = number;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. %nМаксимальная сумма трат за неделю составила %d рублей %n", minExpense, maxExpense);

        System.out.println("Задание 3");

        int [] expensesOnWeeks = {12_000, 25_000, 13_000, 7_000, 10_000};
        float average = 0.00f;
        for (int order = 0; order < expensesOnWeeks.length; order++) {
            average = average + (float) expensesOnWeeks[order] /expensesOnWeeks.length;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", average);

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int cell = reverseFullName.length - 1; cell >= 0; cell--) {
            System.out.print(reverseFullName[cell]);
        }
    }
}