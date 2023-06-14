package Task_15;

import java.util.ArrayList;

public class MainStudentsTask3 {
    public static void main(String[] args) {
        Student s1 = new Student("Smith", 1, 3, 8);
        Student s2 = new Student("Brown", 2, 3, 2);
        Student s3 = new Student("Anderson", 2, 3, 1);
        Student s4 = new Student("Hitch", 3, 1, 5);
        Student s5 = new Student("Ramsay", 1, 2, 7);
        Student s6 = new Student("Miller", 1, 2, 10);

        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);
        System.out.println(listOfStudents);

        removeOrNextCourse(listOfStudents);
        printStudents(listOfStudents, 2);
    }

    static void removeOrNextCourse(ArrayList<Student> listOfStudents) {
        listOfStudents.removeIf(o -> o.getGrade() < 3);
        for (Student s : listOfStudents) {
            if (s.getGrade() > 3) {
                s.setCourse(s.getCourse() + 1);
            }
        }
        System.out.println(listOfStudents);
    }

    static void printStudents(ArrayList<Student> listOfStudents, int course) {
        for (Student s : listOfStudents) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
