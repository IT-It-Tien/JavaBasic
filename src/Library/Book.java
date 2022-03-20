package Library;

/**
 * Created by Dell on 3/20/2022
 *
 * Library.Book
 *  id: "ma sach"
 *  name: "ten"
 *  author: "tac gia"
 *  isBorrowed: "trang thai muon"
 *
 *  Library.Book()
 *  Library.Book(id, name, author)
 *  Library.Book(otherBook): sao chep sach
 *
 *  borrow(): muon sach
 *  toString(): in ra thong tin sach
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private Boolean isBorrowed;

    public Book() {
        id = 0;
        name = "";
        author = "";
        isBorrowed = false;
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        isBorrowed = false;
    }

    public Book(Book otherBook){
        this.id = otherBook.getId();
        this.name = otherBook.getName();
        this.author = otherBook.getAuthor();
        this.isBorrowed = otherBook.getIsBorrowed();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void giveBack() {
        isBorrowed = false;
    }

    public String toString() {
        return id + " " + name + " " + author + " " + isBorrowed;
    }
}
