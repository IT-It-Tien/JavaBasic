package Library;

/**
 * Created by Dell on 3/20/2022.
 * Library:
 * listBook: "1 mang sach"
 * <p>
 * int arr[];
 * Book listBook[3]
 * <p>
 * addBook(): "them sach vao thu vien"
 * borrowBook(id): "muon sach" => sach da duoc muon hay chua?
 * giveBack(id):
 * <p>
 * toString(): "in ra trang thai cua thu vien"
 * <p>
 * int arr[]
 * index 0 1 2 3
 * value 1 4 5 7
 * arr[1] => 4
 * <p>
 * double arr[]
 * index 0 1 2 3
 * value 0.1 0.2 0.3 0.4
 * <p>
 * Book listBook[]
 * index 0 1 2 3
 * value book1 book2 book3 book4
 * <p>
 * listBook[3].borrow()
 */
public class Library {
    private Book[] listBook;
    private int n;

    public Library() {
        listBook = new Book[100];
        n = 0;
    }

    public void addBook(Book book) {
        listBook[n] = book;
        n++;
    }

    public int findBook(int id) {
//        for (int i = 0; i < n; i++) {
//            if (listBook[i].getId() == id) {
//                return i;
//            }
//        }
//        return -1;
        return  id-1;
    }

    public String borrowBook(int id) {
        int index = findBook(id);
        if (index == -1) {
            return "Quyen sach khong ton tai!";
        }
        if (listBook[index].getIsBorroved() == true){
            return "Quyen sach da duoc muon." + listBook[index].toString();
        }
        listBook[index].Broow();{
            return "Muon thanh cong. Sach cua ban day " + listBook[index].toString();
        }
    }

    public void giveBack(int id) {
        listBook[id].isBorroved = false;
    }

    public String toString() {
        String result = "\n Thong tin thu vien: \n";
        for (int i = 0; i < n; i++) {
            result += i + " " + listBook[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String[] argt) {
        Library thuVien = new Library();
        Book book1 = new Book(1 , "lap trinh huong doi tuonh" , "OOP");
        Book book2 = new Book(2 , "phan tich va thiet ke huong doi tuong" , "OOP");
        Book book3 = new Book(3 , "lap trinh gane java" , "OOP");

        thuVien.addBook(book1);
        thuVien.addBook(book2);
        thuVien.addBook(book3);

        System.out.println(thuVien.borrowBook(1));
        System.out.println(thuVien.borrowBook(2));
        System.out.println(thuVien.borrowBook(3));
        thuVien.giveBack(2);
        System.out.println(thuVien.toString());



    }
}