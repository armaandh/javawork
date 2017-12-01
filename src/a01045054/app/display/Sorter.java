package a01045054.app.display;

import a01045054.app.data.Student;

import java.util.Comparator;

public class Sorter {

    public static class FirstNameSorter implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getFirstName().compareTo(s2.getFirstName());
        }
    }

    public static class LastNameSorter implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getLastName().compareTo(s2.getLastName());
        }
    }

    public static class StudentIdSorter implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getStudentId().compareTo(s2.getStudentId());
        }
    }
}
