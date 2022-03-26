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

    public String studentsByGroup(){
        Student[] group = new Student[10];
        int m = 1;
        String a = students[0].getGroup();

        for (int i = 0 ; i < n ; i++) {
            if (a != students[i].getGroup()) {
                a = students[i].getGroup();
                for (int j = i + 1; j < n; j++) {
                   if (sameGroup(students[i],students[j])) {
                       students[j] = group[m];
                   }
                   m++;
                }
            }
        }
        for (int i = 1 ; i <= m ; m++){
            return group[i].getGroup() + "\n" + group[i].getInfo() + "\n" ;
        }
        return a;
    }
    public static void main (String[] args){
        StudentManagement sinhVien = new StudentManagement();

        Student s1 = new Student("Nguyen Van An","17020001","K62CC","17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B","17020002","K62CB","17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C","17020003","K62CC","17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D","17020004","K62CB","17020004@vnu.edu.vn");

        sinhVien.addStudent(s1);
        sinhVien.addStudent(s2);
        sinhVien.addStudent(s3);
        sinhVien.addStudent(s4);

        sinhVien.studentsByGroup();

    }

}
