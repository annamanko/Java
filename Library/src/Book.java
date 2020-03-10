public class Book {
    private int popularity = 0;
    private int id;
    private String title;
    private boolean availible = true;
    private Author author;
    private Author [] additionalAuthors;
    private User currentUser;
    private String type;

    public void returBook (){

}

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author author, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;

    }

    public Book(int id, String title, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }
    public void returnBook(){
        currentUser = null;
        availible = true;
    }
    public String toString(){

        return (String.format ("Typ: %s, Tytuł: %s, id: %d, dostępna %s", type, title, id, availible));
    }
    public boolean equals (Book book){
        if (this.id == book.id)return true;
        return false;
    }
}
