import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    //ФИО сотрудника
    private String department;
    private static final String[] DEPARTMENTS_NAMES = {"1 отдел", "2 отдел", "3 отдел", "4 отдел", "5 отдел"};
    //отделы
    private double employeeSalary;
    //зарплата сотрудника
    private final int id;
    private static int counter = 1;
    public Employee() {
        this.id = counter++;
    }
    //счетчик

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employeeSalary, employee.employeeSalary) == 0 && id == employee.id && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, department, employeeSalary, id);
    }

    public Employee(String surname, String name, String patronymic, String department, double employeeSalary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.employeeSalary = employeeSalary;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Сотрудник " + id + ". " +
                surname + " " +
                name + " " +
                patronymic + ", " +
                "работает в(о) " + department + "е, " +
                "ежемесячная заработная плата составляет: " + employeeSalary + " руб.";
    }

    public static String[] getDepartmentsNames() {
        return DEPARTMENTS_NAMES;
    }

    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }
}