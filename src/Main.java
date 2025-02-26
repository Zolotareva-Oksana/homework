import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] payments = {157, 765, 998, 1306, 2021};
        int sum = 0;
        for (int element : payments) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("\n");
        System.out.println("Задача 2");
        int[] payments2 = Arrays.copyOf(payments, payments.length);
        int maximumWaste = payments2[0];
        int minimumWaste = payments2[0];
        for (int i = 1; i < payments2.length; i++) {
            int desiredExpense = payments2[i];
            if (desiredExpense > maximumWaste) {
                maximumWaste = desiredExpense;
            }
            if (desiredExpense < minimumWaste) {
                minimumWaste = desiredExpense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minimumWaste + " рублей. Максимальная сумма трат за неделю составила " + maximumWaste + " рублей.");

        System.out.println("\n");
        System.out.println("Задача 3");
        int[] payments3 = Arrays.copyOf(payments, payments.length);
        int sum3 = 0;
        for (int element3 : payments3) {
            sum3 += element3;
        }
        double averageExpense = (double) sum3 / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");

        System.out.println("\n");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int archive = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = (char) archive;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}