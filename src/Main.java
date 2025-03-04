import java.util.Arrays;

public class Main {
    public static boolean leapYear(int year) {
        if (year < 1584) {
            System.out.println("В " + year + " году еще не было введено понятие високосного года.");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        return false;
    }

    public static boolean determiningVersion(int clientOS, int clientDeviceYear) {
        String osType = (clientOS == 0 ? "iOS" : "Android");
        String version = (clientDeviceYear >= 2015 ? "" : "облегченную ");
        System.out.println("Установите " + version + "версию приложения для " + osType + " по ссылке.");
        return false;
    }

    public static int cardDelivery(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Доставим карту через " + days + " день." + "\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставим карту через " + (days + 1) + " дня." + "\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставим карту через " + (days + 2) + " дня." + "\n");
        } else {
            System.out.println("К сожалению, при удаленности клиента, свыше 100 км, доставка карт не осуществляется." + "\n");
        }
        return days;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 1509;
        leapYear(year);

        System.out.println("\n");
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2011;
        determiningVersion(clientOS, clientDeviceYear);

        System.out.println("\n");
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        cardDelivery(deliveryDistance);
    }
}