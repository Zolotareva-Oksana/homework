import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Author zon = new Author("Золотарева", "Оксана", "Николаевна");
       Author tln = new Author("Толстой", "Лев", "Николаевич");

       Book test = new Book("Тест", zon, 2025);
       Book dto = new Book("Детство", tln, 1852);
       System.out.println(test);
       System.out.println(dto);

       dto.setYearPublication(2024);
       System.out.println(dto);

       System.out.println(test.getAuthor().equals(dto.getAuthor()));
       System.out.println(test.getYearPublication() == (dto.getYearPublication()));
       System.out.println(test.getTitle().equals(dto.getTitle()));
       System.out.println(dto.getTitle().equals(dto.getTitle()));
    }
}