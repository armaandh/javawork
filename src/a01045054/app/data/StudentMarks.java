package a01045054.app.data;

public class StudentMarks {
    private double quizzes;
    private double assignments;
    private double exams;

    public StudentMarks() {
        super();
    }

    public StudentMarks(double quizzes, double assignments, double exams) {
        super();
        setQuizzes(quizzes);
        setAssignments(assignments);
        setExams(exams);
    }

    public double getQuizzes() {
        return quizzes;
    }

    public double getAssignments() {
        return assignments;
    }

    public double getExams() {
        return exams;
    }

    //Requirement: Passed in param should not be negative
    public void setQuizzes(double quizzes) {
        if (quizzes > 0) {
            this.quizzes = quizzes;
        }

    }

    //Requirement: Passed in param should not be negative
    public void setAssignments(double assignments) {
        if (assignments > 0) {
            this.assignments = assignments;
        }
    }

    //Requirement: Passed in param should not be negative
    public void setExams(double exams) {
        if(exams > 0) {
            this.exams = exams;
        }
    }

    @Override
    public String toString() {
        return quizzes + "-" + assignments + "-" + exams;
    }
}
