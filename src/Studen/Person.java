package Studen;

/**
 * Created by Dell on 3/26/2022.
 */
public class Person {
    private String name;

    public Person(){
        name = " ";
    }
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}