package Studen;

/**
 * Created by Dell on 3/26/2022.
 */
public class StudentManagement {

    // sai ten bien, cau 6
    private static Student[] students;
    private int n;

    public StudentManagement(){
        students = new Student[100];
        n = 0;
    }

    public void addStudent(Student s){
        students[n] = s;
        n++;
    }

    // thieu cau 5
    public boolean sameGroup(Student s1, Student s2){
        if (s1.getGroup() == s2.getGroup()) {
            return true;
        }
        return false;
    }

    public Boolean isInGroups(String group, String[] groups, int n) {
        for(int i = 0; i < n; i++) {
            if(groups[i] == group) {
                return true;
            }
        }
        return false;
    }

    public String studentsByGroup(){
        String a = "";
        String groups[] = new String[100];
        int groupsLength = 0;

        for (int i = 0 ; i < n ; i++) {
            a = students[i].getGroup();
            if (!isInGroups(a, groups, groupsLength)) {
                groups[groupsLength++] = a;
                System.out.println(a);
                for (int j = 0; j < n; j++) {
                   if (sameGroup(students[i], students[j])) {
                       System.out.println(students[j].getInfo());
                   }
                }
            }
        }
        return a;
    }
    public static void main (String[] args){
        StudentManagement sinhVien = new StudentManagement();

        Student s1 = new Student("Nguyen Van An","17020001","K62CC","17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B","17020002","K62CB","17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C","17020003","K62CC","17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D","17020004","K62CB","17020004@vnu.edu.vn");
        Student s5 = new Student("Nguyen Van E","17020004","K62CA","17020005@vnu.edu.vn");

        sinhVien.addStudent(s1);
        sinhVien.addStudent(s2);
        sinhVien.addStudent(s3);
        sinhVien.addStudent(s4);
        sinhVien.addStudent(s5);

        sinhVien.studentsByGroup();

    }

}
