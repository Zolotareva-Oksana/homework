public class Book {
String title;
Author author;
int yearPublication;
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

    public void fullInformationBook() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author.fullNameAuthor());
        System.out.println("Год публикации: " + yearPublication);
        // метод вывода полной информации о книге
    }
}