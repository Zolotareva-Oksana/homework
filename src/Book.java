import java.util.Objects;

public class Book {
private String title;
private Author author;
private int yearPublication;
// создаем свойства книги

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
        // метод присваивания индивидуальных значений
    }

    public String getTitle() {
        return title;
        // возвращаем название
    }

    public Author getAuthor() {
        return author;
        // возвращаем имя автора
    }

    public int getYearPublication() {
        return yearPublication;
        // возвращаем год издания
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
        // открываем возможность поменять год издания книги
    }

    @Override
    public String toString() {
        return String.format("Название: %s. Автор: %s. Год публикации: %d.",
                title, author.toString(), yearPublication);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublication);
    }
}