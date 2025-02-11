public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Варианты ответов на Задачу 1" + "\n");
        //Задача 1
        //Вариант if-else
        char clientOS = '0';
        if (clientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке " + "\n");
        } else if (clientOS == '1') {
            System.out.println("Установите версию приложения для Android по ссылке " + "\n");
        }
        //Вариант switch
        int clientOS1 = '3';
        switch (clientOS1) {
            case '0':
                System.out.println("Установите версию приложения для iOS по ссылке " + "\n");
                break;
            case '1':
                System.out.println("Установите версию приложения для Android по ссылке " + "\n");
                break;
            default:
                System.out.println("Выберите версию устанавливаемого приложения." + "\n");
        }

        System.out.println("\n" + "Задача 2" + "\n");
        //Задача 2
        int clientOS3 = 0;
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS3 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке " + "\n");
        } else if (clientDeviceYear >= 2015 && clientOS3 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке " + "\n");
        } else if (clientDeviceYear < 2015 && clientOS3 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке " + "\n");
        } else if (clientDeviceYear < 2015 && clientOS3 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке " + "\n");
        }
        //Ч/з тенарный оператор (не учтен год создания систем! - 2007)
        int clientOS4 = 1;
        int clientDeviceYear1 = 2003;
        String osType = (clientOS4 == 0 ? "iOS" : "Android");
        String version = (clientDeviceYear1 >= 2015 ? "" : "облегченную ");
        System.out.println("Установите " + version + "версию приложения для " + osType + " по ссылке\n");

        System.out.println("\n" + "Задача 3" + "\n");
        //Задача 3
        int year = 2300;
        if (year < 1584) {
            System.out.println("В " + year + " году еще не было введено понятие високосного года.");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("\n" + "Задача 4" + "\n");
        //Задача 4
        int deliveryDistance = 125;
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

        System.out.println("\n" + "Задача 5" + "\n");
        //Задача 5
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц (он же январь) принадлежит сезону зима." + "\n");
                break;
            case 2:
                System.out.println(monthNumber + " месяц (он же февраль) принадлежит сезону зима." + "\n");
                break;
            case 3:
                System.out.println(monthNumber + " месяц (он же март) относится к сезону весна." + "\n");
                break;
            case 4:
                System.out.println(monthNumber + " месяц (он же апрель) относится к сезону весна." + "\n");
                break;
            case 5:
                System.out.println(monthNumber + " месяц (он же май) относится к сезону весна." + "\n");
                break;
            case 6:
                System.out.println(monthNumber + " месяц (он же июнь) относится к сезону лето." + "\n");
                break;
            case 7:
                System.out.println(monthNumber + " месяц (он же июль) относится к сезону лето." + "\n");
                break;
            case 8:
                System.out.println(monthNumber + " месяц (он же август) относится к сезону лето." + "\n");
                break;
            case 9:
                System.out.println(monthNumber + " месяц (он же сентябрь) относится к сезону осень." + "\n");
                break;
            case 10:
                System.out.println(monthNumber + " месяц (он же октябрь) относится к сезону осень." + "\n");
                break;
            case 11:
                System.out.println(monthNumber + " месяц (он же ноябрь) относится к сезону осень." + "\n");
                break;
            case 12:
                System.out.println(monthNumber + " месяц (он же декабрь) относится к сезону зима." + "\n");
                break;
            default:
                System.out.println("Такого месяца не существует в природе." + "\n");
        }
    }
}