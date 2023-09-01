public class Grading {
    private static int id;
    private static Assignment assignment;
    private static Student student;
    private static int grade;

    public static void Grading(int graId, Assignment graAssignment, Student graStudent,
        int graGrade) {
        id = graId;
        assignment = graAssignment;
        student = graStudent;
        grade = graGrade;
    }

    public static int getID() {
        return id;
    }

    public static Assignment getAssignment() {
        return assignment;
    }

    public static Student getStudent() {
        return student;
    }

    public static int getGrade() {
        return grade;
    }

}
