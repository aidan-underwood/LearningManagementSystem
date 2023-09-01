import java.util.ArrayList;

public class Course {
    private int courseID;
    private String title;
    private String teacher;

    private ArrayList students;
    private ArrayList<Assignment> assignments;
    private ArrayList discussions;

    Course(int courseID, String title, String teacher, ArrayList students,
        ArrayList<Assignment> assignments, ArrayList discussions) {
        this.courseID = courseID;
        this.title = title;
        this.teacher = teacher;
        this.students = students;
        this.assignments = assignments;
        this.discussions = discussions;
    }

    public int getID() {
        return courseID;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    public ArrayList getStudents() {
        return students;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public ArrayList getDiscussions() {
        return discussions;
    }

    public void setID(int newID) {
        courseID = newID;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setTeacher(String newTeacher) {
        teacher = newTeacher;
    }

    public void addStudent() {
        // not implemented
    }

    public void purgeStudent() {
        // not implemented
    }

    public void addAssignment() {
        // not implemented
    }

    public void purgeAssignment() {
        // not implemented
    }

    public void addDiscussion() {
        // not implemented
    }

    public void purgeDiscussion() {
        // not implemented
    }
}
