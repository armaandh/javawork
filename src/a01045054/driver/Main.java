package a01045054.driver;
import a01045054.app.dao.StudentDAO;
import a01045054.app.data.Student;
import a01045054.app.display.Sorter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = null;
        Sorter s = new Sorter();
        try {
            // change path so it works for all environments! ask professor for method name! getAbsolutePath
            students = StudentDAO.readTxtFile("/Users/armaandh/Desktop/studentData.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Write to text file in original order
            StudentDAO.WriteTxtFile(students);

            //Write to text file in first name order
            Sorter.FirstNameSorter firstNameSorter = new Sorter.FirstNameSorter();
            Collections.sort(students, firstNameSorter);
            StudentDAO.WriteTxtFile(students);

            //Write to text file in last name order
            Sorter.LastNameSorter lastNameSorter = new Sorter.LastNameSorter();
            Collections.sort(students, lastNameSorter);
            StudentDAO.WriteTxtFile(students);

            //Write to text file in student id order
            Sorter.StudentIdSorter studentIDSorter = new Sorter.StudentIdSorter();
            Collections.sort(students, studentIDSorter);
            StudentDAO.WriteTxtFile(students);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
