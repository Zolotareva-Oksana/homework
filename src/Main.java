public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        double income = 15000;
        double savings = 0;
        int i = 0;
        while (savings <= 2_459_000) {
            savings = savings + income;
            i++;
            if (i % 12 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей.");
            }
        }

        System.out.println("\n");
        System.out.println("Задача 2");
        int number = 0;
        while (number <= 9) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number1 = 10; number1 > 0; number1 = number1 - 1) {
            System.out.print(number1 + " ");
        }

        System.out.println("\n");
        System.out.println("Задача 3");
        int year = 0;
        long populationSize = 12_000_000L;
        double birthRate = populationSize * 0.017;
        double mortalityRate = populationSize * 0.008;
        long populationChange = (long) (birthRate - mortalityRate);
        while (year <= 9) {
            year++;
            populationSize += populationChange;
            System.out.println("Год " + year + ", численность населения составляет " + populationSize + " чел.");
        }

        System.out.println("\n");
        System.out.println("Задача 4");
        long deposit = 15_000;
        long totalSavings = deposit + (long) (deposit * 0.07);
        int month = 0;
        while (totalSavings < 12_000_000) {
            totalSavings = totalSavings + deposit;
            month++;
            if (month % 48 == 0) {
                System.out.println("Василию потребуется " + month + " месяца(ев), чтобы накопить " + totalSavings + " руб.");
            }
        }

        System.out.println("\n");
        System.out.println("Задача 5");
        long deposit1 = 15_000;
        long totalSavings1 = deposit + (long) (deposit * 0.07);
        int month1 = 0;
        while (totalSavings1 < 12_000_000) {
            totalSavings1 = totalSavings1 + deposit1;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Василию потребуется " + month1 + " месяца(ев), чтобы накопить " + totalSavings1 + " руб.");
            }
        }

        System.out.println("\n");
        System.out.println("Задача 6");
        long deposit2 = 15_000;
        long totalSavings2 = deposit2 + (long) (deposit2 * 0.07);
        int month2 = 0;
        while (month2 <= 108) {
            month2++;
            totalSavings2 = totalSavings2 + deposit2;
            if (month2 % 6 == 0) {
                System.out.println("Василий за " + month2 + " месяца(ев), накопит " + totalSavings2 + " руб.");
            }
        }

        System.out.println("\n");
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("\n");
        System.out.println("Задача 8");
        int currentYear = 2025;
        int beginning = currentYear - 200;
        int end = currentYear + 100;
        for (int yearFlight = beginning; yearFlight <= end; yearFlight+=79) {
            System.out.println(yearFlight);
        }
    }
}