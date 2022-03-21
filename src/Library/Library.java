package Library;

import java.util.Random;

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
    Book listBook[];

    public void addBook(int i) {
        for (int j = 0; j < i; j++) {
            listBook[j].getId();
            listBook[j].getId();
            listBook[j].getId();
            listBook[j].isBorroved = true;
        }
    }

    public String borrowBook(int id) {
        if (listBook[id].isBorroved == false) return "sach chua duoc muon";
        return "sach da duoc muon";
    }

    public void giveBack(int id) {
        listBook[id].isBorroved = false;
    }

    public String toString() {
        for (int i = 0; i < n; i++) {
            System.out.print(listBook[i].id + "/n" + listBook[i].name + "/n" + listBook[i].author + "/n" + listBook[i].isBorroved);
        }
        return null;
    }

    public static void main(String[] argt) {
        Book listBook[];


    }
}