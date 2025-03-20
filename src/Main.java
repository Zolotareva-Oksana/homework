import java.util.ArrayList;
import java.util.List;

public class Main {
   public static String[] department = {"1 отдел", "2 отдел", "3 отдел", "4 отдел", "5 отдел"};
   public static double[] salary = new double[]{50000.0, 51000.0, 52000.0, 53000.0, 54000.0};

   public static Employee[] employees = new Employee[10];

   public static void print() {
      for (Employee employee : employees)
         System.out.println(employee);
   }

   private static double amountMonthlySalary() {
      double sum = 0.00;
      for (Employee employee : employees)
         sum += employee.getSalary();
      return sum;
   }

   private static void findAndPrintEmployeesWithMinSalary() {
      List<Employee> minSalaryEmployees = new ArrayList<>();
      Employee employeeMinSalary = null;
      for (Employee employee : employees) {
         if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
            employeeMinSalary = employee;
         }
      }
      if (employeeMinSalary != null) {
         for (Employee employee : employees) {
            if (employee.getSalary() == employeeMinSalary.getSalary()) {
               minSalaryEmployees.add(employee);
            }
         }
         if (!minSalaryEmployees.isEmpty()) {
            System.out.println("Список сотрудников с минимальной заработной платой:");
            for (Employee employee : minSalaryEmployees) {
               System.out.println(employee);
            }
         } else {
            System.out.println("Не найдено сотрудников с минимальной заработной платой.");
         }
      }
   }

   private static void findAndPrintEmployeesWithMaxSalary() {
      List<Employee> maxSalaryEmployees = new ArrayList<>();
      Employee employeeMaxSalary = null;
      for (Employee employee : employees) {
         if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
            employeeMaxSalary = employee;
         }
      }
      if (employeeMaxSalary != null) {
         for (Employee employee : employees) {
            if (employee.getSalary() == employeeMaxSalary.getSalary()) {
               maxSalaryEmployees.add(employee);
            }
         }
         if (!maxSalaryEmployees.isEmpty()) {
            System.out.println("Список сотрудников с максимальной заработной платой:");
            for (Employee employee : maxSalaryEmployees) {
               System.out.println(employee);
            }
         } else {
            System.out.println("Не найдено сотрудников с максимальной заработной платой.");
         }
      }
   }

   private static double calculateAverageSalary () {
       return (double) amountMonthlySalary() / employees.length;
   }

   public static void printFullName() {
      for (Employee employee : employees)
         System.out.println(employee.getFullName());
   }

   public static void main(String[] args) {
      employees[0] = new Employee("Иванов Иван Иванович", department[0], salary[0]);
      employees[1] = new Employee("Петров Петр Петрович", department[1], salary[1]);
      employees[2] = new Employee("Васильев Василий Васильевич", department[2], salary[2]);
      employees[3] = new Employee("Николаев Николай Николаевич", department[3], salary[3]);
      employees[4] = new Employee("Федоров Федор Федорович", department[4], salary[4]);
      employees[5] = new Employee("Максимов Максим Максимович", department[0], salary[0]);
      employees[6] = new Employee("Геннадиев Геннадий Геннадиевич", department[1], salary[1]);
      employees[7] = new Employee("Александров Александр Александрович", department[2], salary[2]);
      employees[8] = new Employee("Станиславов Станислав Станиславович", department[3], salary[3]);
      employees[9] = new Employee("Владимиров Владимир Владимирович", department[4], salary[4]);

      print();
      System.out.println();
      System.out.println("Сумма затрат на ЗП сотрудников в месяц, составляет: " + amountMonthlySalary() + " руб.");
      System.out.println();
      findAndPrintEmployeesWithMinSalary();
      System.out.println();
      findAndPrintEmployeesWithMaxSalary();
      System.out.println();
      System.out.println("Cреднее значение зарплат: " + calculateAverageSalary() + " руб.");
      System.out.println();
      printFullName();
   }
}