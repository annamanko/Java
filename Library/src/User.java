import java.util.NoSuchElementException;
import static  java.util.Arrays.copyOf;

public class User extends Main {
    private Book[] books = new Book[0];

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
       
    }
    public void addBook(Book book){
        this.books = copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }
    public void returnBook (Book book){
        book.returnBook();
        for (int i = 1; i < books.length; i++) {
            if (books[i].equals(book)){
                books[i]= books[i];
                return;
            }
        }
        throw new NoSuchElementException("Książka nie istnieje na liście wypożyczonych książek użytkownika.");
    }
    public String toString(){
        if (books.length == 1)
            return (String.format("Użytkownik posiada książkę %d", books.length));
        else if (books.length < 5)
            return (String.format("Użytkownik posiada %d książki", books.length));
        else 
            return (String.format("Użytkownik posiada %d książek", books.length));
        
    }
    public void printAllUserBooks (){
        for (int i = 0; i < books.length ; i++) {
            System.out.println(books[i]);
            
        }
    }
}
