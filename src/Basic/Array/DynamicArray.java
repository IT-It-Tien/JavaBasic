package Basic.Array;

import java.util.ArrayList;

/**
 * Created by Dell on 3/27/2022.
 */
public class DynamicArray {
    private ArrayList<String> strs = new ArrayList<String>();

    public void addString(String string){
        strs.add(string);
    }

    public void removeStringAt(int index){
        index = checkIndex(index);
        strs.remove(index);
    }

    public void editString(int index, String string){
        index = checkIndex(index);
        strs.set(index, string);
    }

    public void print() {
        for(int i = 0; i < strs.size(); i++){
            System.out.println(i + " " + strs.get(i));
        }
        System.out.println();
    }

    private int checkIndex(int index) {
        if(index < 0) return 0;
        if(index >= strs.size()) return strs.size()-1;
        return index;
    }

    public static void main(String []str){
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.addString("Lan");
        dynamicArray.addString("Anh");
        dynamicArray.addString("Hue");
        dynamicArray.addString("Ngoc");
        dynamicArray.print();

        dynamicArray.removeStringAt(-10);
        dynamicArray.editString(40, "Linh");
        dynamicArray.print();
    }
}
