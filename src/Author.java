import java.util.Objects;

public class Author {
    private final String surname;
    private final String name;
    private final String patronymic;
    //задаем переменные полного имени автора

    public Author(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        // создаем метод присвоения индивидуального имени
    }

    public String getSurname() {
        return surname;
        // возвращаем фамилию
    }

    public String getName() {
        return this.name;
        // возвращаем имя
    }

    public String getPatronymic() {
        return patronymic;
        // возвращаем отчество
    }

    @Override
    public String toString() {
      return String.format("%s %s %s", surname, name, patronymic);
      //переписка предопределенного метода для вывода в строку полного имени автора
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) && Objects.equals(name, author.name) && Objects.equals(patronymic, author.patronymic);
        //переписка предопределенного метода для сравнения полных имен авторов
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);
    }
}