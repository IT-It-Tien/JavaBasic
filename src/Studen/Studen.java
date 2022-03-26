package Studen;

/**
 * Created by Dell on 3/26/2022.
 */
class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    // sai cau 4.1
    public Student() {
        name = "student";
        id = "000";
        group = "K62CB";
        email = "uet@vn.edu.vn";
    }

    // sai cau 4.2
    public Student(String name, String id, String grup, String email) {
        this.name = name;
        this.id = id;
        this.group = grup;
        this.email = email;
    }

    // thieu cau 4.3
    public Student(Student s) {
        s.name = name;
        s.id = id;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    // thieu setId()
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
