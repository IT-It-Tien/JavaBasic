public class Person {
    int tuoi;
    String name;
    // thuộc tính name

    // phương thức khởi tạo không tham số
    public Person() {
        name = "Truong";
        tuoi = 0;
    }

    // phương thức khởi tạo 1 tham số (name)
    public Person(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    // getter cho thuộc tính name
    public String getName() {
        return name;
    }

    int getTuoi() {
        return tuoi;
    }

    // setter cho thuộc tính name
    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.getTuoi());
    }
}