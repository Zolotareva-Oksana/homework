import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName + ".");

        System.out.println("\n");
        System.out.println("Задача 2");
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName2 + ".");

        System.out.println("\n");
        System.out.println("Задача 3");
        String firstName3 = "Семён ";
        String middleName3 = "Семёнович";
        String lastName3 = "Иванов ";
        String fullName3 = lastName3 + firstName3 + middleName3;
        String fullName4 = fullName3.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName4 + ".");
    }
}