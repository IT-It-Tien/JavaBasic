/**
 * Created by Dell on 3/20/2022.
 */
public class Dog {
    String name;
    int age;
    String type;

    public Dog() {
        name = "name";
        age = 0;
        type = "VN";
    }

    public  String toString() {
        return  name + " " + age + " " + type;
    }

    public String makeSound() {
        if(age <= 5) return  "Wan wan";
        return "Gau Gau";
    }

    public void after5year() {
        age = age + 5;
    }

    public  static  void main(String[] args){
        Dog myDog = new Dog();
        myDog.name = "Xuka";
        myDog.age = 1;

        System.out.println(myDog.makeSound());

        myDog.after5year();

        System.out.println(myDog.makeSound());

    }
}
