public class Author {
    private String surname;
    private String name;
    private String patronymic;
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

    public String fullNameAuthor() {
        return surname + " " + name + " " + patronymic;
        // метод вывода полного имени автора
    }
}