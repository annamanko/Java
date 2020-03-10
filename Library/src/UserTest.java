public class UserTest {
    public static void main(String[] args) {
        Author scott = new Author(1, "Scott", "Lynch");
        Book book1 = new Book(1, "Kłamstwa Locka Lamory", scott, "book");
        Book audio2 = new Book(2, "Na szkarłatnych morzach", scott, "audio");
        Book book3 = new Book(3, "Republika Złodziei", scott, "book");
        Book ebook1 = new Book (4, "Cierń Emberlainu", scott, "ebook");

        User readerLynch = new User(1, "Michał", "Kowalski");
        readerLynch.addBook(book1);
        readerLynch.addBook(audio2);
        readerLynch.addBook(ebook1);
        System.out.println(readerLynch);
        readerLynch.printAllUserBooks();


    }
}