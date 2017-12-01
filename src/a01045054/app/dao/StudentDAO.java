package a01045054.app.dao;

import a01045054.app.data.Student;
import a01045054.app.data.StudentMarks;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDAO {
    public static Student createStudent(String firstName, String lastName, String studentId){
        return new Student(firstName, lastName, studentId, null);
    }

    public static StudentMarks createStudentMarks(double quizGrade, double assignmentsGrade, double examsGrade){
        return new StudentMarks(quizGrade, assignmentsGrade, examsGrade);
    }
    public static ArrayList<Student> readTxtFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner input = new Scanner(file);
        ArrayList<Student> studentArr = new ArrayList<>();

        while (input.hasNext()) {
            String line = input.nextLine();
            String[] lines = line.split("\\|");
            Student student = createStudent(lines[0], lines[1], lines[2]);
            StudentMarks mark = createStudentMarks(Double.parseDouble(lines[3]), Double.parseDouble(lines[4]), Double.parseDouble(lines[5]));
            student.setStudentMarks(mark);
            studentArr.add(student);

        }
        input.close();

        return studentArr;
    }

    public static void WriteTxtFile(ArrayList<Student> students) throws IOException {
        File file = new File("generatedMarks.txt");
        if (!file.exists()) {
            System.out.println("Created new file");
            file.createNewFile();
        }

        PrintWriter output = new PrintWriter(new FileWriter(file, true));
        for (Student student : students) {
            output.format("%s, %s - Quizzes: %.1f, Assignments: %.1f, Exams: %.1f",
                    student.getFullName(),
                    student.getStudentId(),
                    student.getStudentMarks().getQuizzes(),
                    student.getStudentMarks().getAssignments(),
                    student.getStudentMarks().getExams());
            output.println();
        }
        output.println("**************************************************");
        output.close();
    }
}
