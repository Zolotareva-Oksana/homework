import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doobleArray = new double[3];
        doobleArray[0] = 1.57;
        doobleArray[1] = 7.654;
        doobleArray[2] = 9.986;

        char[] charArray = new char[3];
        charArray[0] = 'D';
        charArray[1] = 'O';
        charArray[2] = 'G';
        System.out.println("Создано 3 массива: int, dooble и char. Во 2 задаче будет представлен вывод массивов.");

        System.out.println("\n");
        System.out.println("Задача 2");
        {
            System.out.println(Arrays.toString(intArray));
            System.out.println(Arrays.toString(doobleArray));
            System.out.println(Arrays.toString(charArray));
        }

        System.out.println("\n");
        System.out.println("Задача 3");
        for (int i = 3 - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 3 - 1; i >= 0; i--) {
            System.out.print(doobleArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 3 - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");
        System.out.println("Задача 4");
        for (int i = 0; i <= 2; i++) {
            if (intArray[i] % 2 != 0)
                intArray[i]++;
            System.out.println(intArray[i]);
        }
    }
}