package Library;

/**
 * Created by Dell on 3/20/2022.
 * Library:
 *  listBook: "1 mang sach"
 *
 *  addBook(): "them sach vao thu vien"
 *  borrowBook(id): "muon sach" => sach da duoc muon hay chua?
 *
 *  toString(): "in ra trang thai cua thu vien"
 */
public class Library {
    private Book[] listBook;
    private int numberOfBook;

    public Library() {
        listBook = new Book[100];
        numberOfBook = 0;
    }

    public void addBook(Book book) {
        listBook[numberOfBook] = book;
        numberOfBook++;
    }

    public int findBook(int id) {
        for(int i = 0; i < numberOfBook; i++) {
            if(listBook[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public String borrowBook(int id) {
        int index = findBook(id);
        if(index == -1) {
            return "Quyen sach nay khong ton tai!";
        }

        if(listBook[index].getIsBorrowed()){
            return "Quyen sach nay da duoc muon! " + listBook[index].toString();
        }
        listBook[index].borrow();
        return "Muon thanh cong! Sach cua ban: " + listBook[index].toString();
    }

    public String giveBackBook(int id) {
        int index = findBook(id);
        if(index == -1) {
            return "Quyen sach nay khong ton tai!";
        }

        if(!listBook[index].getIsBorrowed()){
            return "Chua muon thi tra kieu gi? " + listBook[index].toString();
        }

        listBook[index].giveBack();

        return "Tra sach thanh cong! " + listBook[index].toString();
    }

    public String toString() {
        String result = "\n Thong tin thu vien: \n";
        for(int i = 0; i < numberOfBook; i++) {
            result += i + " " + listBook[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String args[]) {
        Library thuVien = new Library();
        Book book1 = new Book(101, "Lap trinh huong doi tuong", "OOP");
        Book book2 = new Book(102, "Phan tich va thiet ke huong doi tuong", "OOAD");
        Book book3 = new Book(103, "Lap trinh game bang Java", "MOBILE");

        thuVien.addBook(book1);
        thuVien.addBook(book2);
        thuVien.addBook(book3);

        System.out.println(thuVien.toString());

        System.out.println(thuVien.borrowBook(101));
        System.out.println(thuVien.borrowBook(102));
        System.out.println(thuVien.borrowBook(102));
        System.out.println(thuVien.giveBackBook(103));
        System.out.println(thuVien.borrowBook(103));
        System.out.println(thuVien.giveBackBook(101));


        System.out.println(thuVien.toString());
    }
}