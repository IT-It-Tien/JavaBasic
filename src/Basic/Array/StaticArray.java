package Basic.Array;

/**
 * Created by Dell on 3/27/2022.
 */
public class StaticArray {
    private String[] strs = new String[100];
    private int length;

    public void StaticArray(){
//        strs = new String[100];
        length = 0;
    }
    public void addString(String s){
        strs[length] = s;
        length++;
    }
    public void print(){
        for (int i = 0 ; i < length ; i++) {
            System.out.println(i + " " + strs[i]);
        }
        System.out.println();
    }
    public void removeStringAt(int n){
        n = checkIndex(n);
        for (int i = n ; i < length -1 ; i++){
            strs[i] = strs[i+1];
        }
        length--;
    }
    public void editString(int n, String s){
        if (n >= length){strs[length-1] = s;}
        for (int i = 0 ; i < length ; i++){
            if (n == i){
                strs[i] = s;
            }
        }
    }

    private int checkIndex(int index){
        return 0;
    }

    public static void main(String []str){
        StaticArray staticArray = new StaticArray();

        staticArray.addString("Lan");
        staticArray.addString("Anh");
        staticArray.addString("Hue");
        staticArray.addString("Ngoc");
        staticArray.print();

        staticArray.removeStringAt(-10);
        staticArray.editString(40, "Linh");
        staticArray.print();



        /*
            0 Lan
            1 Anh
            2 Hue
            3 Ngoc

            0 Anh
            1 Hue
            2 Linh
         */
    }
}
