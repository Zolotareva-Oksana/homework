import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      Employee[] employee = new Employee[10];
      employee[0] = new Employee("Иванов", "Иван", "Иванович", Employee.getDepartmentsNames()[0], 50000.0);
      employee[1] = new Employee("Васильев", "Василий", "Васильевич", Employee.getDepartmentsNames()[1], 51000.0);
      employee[2] = new Employee("Александрова", "Александра", "Александровна", Employee.getDepartmentsNames()[2], 52000.0);
      employee[3] = new Employee("Сергеев", "Сергей", "Сергеевич", Employee.getDepartmentsNames()[3], 54000.0);
      employee[4] = new Employee("Максимова", "Максим", "Максимовна", Employee.getDepartmentsNames()[4], 55000.0);
      employee[5] = new Employee("Любимова", "Любовь", "Ивановна", Employee.getDepartmentsNames()[0], 50000.0);
      employee[6] = new Employee("Назарова", "Вера", "Константиновна", Employee.getDepartmentsNames()[1], 51000.0);
      employee[7] = new Employee("Зайцев", "Олег", "Васильевич", Employee.getDepartmentsNames()[2], 52000.0);
      employee[8] = new Employee("Александров", "Александр", "Александрович", Employee.getDepartmentsNames()[3], 54000.0);
      employee[9] = new Employee("Вишняков", "Роман", "Валерьевич", Employee.getDepartmentsNames()[4], 55000.0);

      //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString));
      System.out.println();
      for (int i = 0; i < employee.length; i++) {
         System.out.println(employee[i].toString());
      }
      System.out.println();

      //Подсчитать сумму затрат на ЗП в месяц;
      double totalMonthlySalary = 0.0;
      for (Employee employees : employee) {
         totalMonthlySalary += employees.getEmployeeSalary();
      }
      System.out.println("Сумма затрат на ЗП в месяц составит: " + totalMonthlySalary + " руб.");
      System.out.println();

      //Найти сотрудника с минимальной ЗП;
      double minEmployeeSalary = Double.POSITIVE_INFINITY;
      List<Employee> minSalaryEmployees = new ArrayList<>(); // Список для хранения всех сотрудников с минимальной зарплатой

      // Поиск минимальной зарплаты и сборка списка сотрудников с такой зарплатой
      for (Employee employees : employee) {
         if (employees.getEmployeeSalary() < minEmployeeSalary) {
            minEmployeeSalary = employees.getEmployeeSalary();
            minSalaryEmployees.clear(); // Очищаем список перед добавлением нового минимального значения
            minSalaryEmployees.add(employees); // Добавляем первого сотрудника с новой минимальной зарплатой
         } else if (employees.getEmployeeSalary() == minEmployeeSalary) {
            minSalaryEmployees.add(employees); // Добавляем остальных сотрудников с той же минимальной зарплатой
         }
      }
      // Вывод результатов
      System.out.println("Сотрудники с минимальной зарплатой:");
      for (Employee employees : minSalaryEmployees) {
         System.out.println(employees.getId() + ". " + employees.getDepartment() + ". " + employees.getFullName() + " - " + employees.getEmployeeSalary() + " руб.");
      }
      System.out.println();

      // Найти сотрудника с максимальной ЗП;
      double maxEmployeeSalary = Double.NEGATIVE_INFINITY;
      List<Employee> maxSalaryEmployees = new ArrayList<>();
      for (Employee employees : employee) {
         if (employees.getEmployeeSalary() > maxEmployeeSalary) {
            maxEmployeeSalary = employees.getEmployeeSalary();
            maxSalaryEmployees.clear();
            maxSalaryEmployees.add(employees);
         } else if (employees.getEmployeeSalary() == maxEmployeeSalary) {
            maxSalaryEmployees.add(employees);
         }
      }
      System.out.println("Сотрудники с максимальной зарплатой:");
      for (Employee employees : maxSalaryEmployees) {
         System.out.println(employees.getId() + ". " + employees.getDepartment() + ". " + employees.getFullName() + " - " + employees.getEmployeeSalary() + " руб.");
      }
      System.out.println();

      // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
      double averageSalary;
      int numberOfEmployees = employee.length; // Количество сотрудников
      {
         averageSalary = totalMonthlySalary / numberOfEmployees;
      }
      System.out.println("Средняя зарплата в месяц составит: " + averageSalary + " руб.");
      System.out.println();

      printEmployees(employee);

   }  // Распечатать ФИО всех сотрудников (метод void).
      public static void printEmployees (Employee[]employee){
         for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getId() + ". " + employee[i].getFullName() + ".");
         }
      }
   }