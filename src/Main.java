import java.util.Arrays;

public class Main {
    public static boolean leapYear(int year) {
        if (year < 1584) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean determiningVersion(int clientOS, int clientDeviceYear) {
        String osType = (clientOS == 0 ? "iOS" : "Android");
        String version = (clientDeviceYear >= 2015 ? "" : "облегченную ");
        System.out.println("Установите " + version + "версию приложения для " + osType + " по ссылке.");
        return false;
    }

    public static boolean cardDelivery(int deliveryDistance, int days) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Доставим карту через " + days + " день." + "\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставим карту через " + (days + 1) + " дня." + "\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставим карту через " + (days + 2) + " дня." + "\n");
        } else {
            System.out.println("К сожалению, при удаленности клиента, свыше 100 км, доставка карт не осуществляется." + "\n");
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2059;
        if (leapYear(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("\n");
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2011;
        determiningVersion(clientOS, clientDeviceYear);

        System.out.println("\n");
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        int days = 1;
        cardDelivery(deliveryDistance, days);
    }
}