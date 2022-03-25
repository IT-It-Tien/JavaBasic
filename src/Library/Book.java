package Library;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Dell on 3/20/2022
 * <p>
 * Library.Book
 * id: "ma sach"
 * name: "ten"
 * author: "tac gia"
 * isBorrowed: "trang thai muon": bool
 * <p>
 * Library.Book()
 * Library.Book(id, name, author)
 * Library.Book(otherBook): sao chep sach
 * this.id = ottherBook.id
 * <p>
 * borrow(): muon sach
 * giveBack(): tra sach
 * toString(): in ra thong tin sach
 */
public class Book {
    int id;
    String name;
    String author;
    boolean isBorroved;


    public Book() {
        id = 0;
        name = " ";
        author = " ";
        isBorroved = false;
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isBorroved = false;
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

    public Boolean getIsBorroved(){ return isBorroved; }

    public void setId() {
        this.id = id;
    }

    public void setName() {
        this.name = name;
    }

    public void setAuthor() {
        this.author = author;
    }

    public void setIsBorrver() {
        this.isBorroved = isBorroved;
    }

    public void Broow() {
        isBorroved = true;
    }

    public void giveback() {
        isBorroved = false;
    }

    public String toString(){
        return id + " " + name + " " + author + " " + isBorroved;
    }
}





