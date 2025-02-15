public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Задача 3");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Задача 5");
        for (int i = 1904; i % 100 != 0 || i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("\n");
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Задача 7");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Задача 8");
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей.");
        }

        System.out.println("\n");
        System.out.println("Задача 9");
        double savings1 = 29000;
        for (int i = 1; i <= 12; i++) {
            savings1 += savings1 * 0.012;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings1 + " рублей.");
        }

        System.out.println("\n");
        System.out.println("Задача 10");
        int b;
        for (int i = 1; i <= 10; i++) {
            b = 2 * i;
            System.out.println("2*" + i + "=" + b);
        }
    }
}
