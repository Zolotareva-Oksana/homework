import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Author zon = new Author("Золотарева", "Оксана", "Николаевна");
       Author tln = new Author("Толстой", "Лев", "Николаевич");

       Book test = new Book("Тест", zon, 2025);
       Book dto = new Book("Детство", tln, 1852);

       test.fullInformationBook();
       System.out.println();
       dto.fullInformationBook();
       System.out.println();
       dto.setYearPublication(2024);
       dto.fullInformationBook();
    }
}