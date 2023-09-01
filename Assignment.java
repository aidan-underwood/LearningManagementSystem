public class Assignment {
    private int assignmentID;
    private String title;
    private String description;
    private String dueDate;
    private String course;

    Assignment(int assignmentID, String title, String description, String dueDate, String course) {
        this.assignmentID = assignmentID;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.course = course;
    }

    public int getID() {
        return assignmentID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDue() {
        return dueDate;
    }

    public String getCourse() {
        return course;
    }

    public void setID(int ID) {
        assignmentID = ID;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setDescription(String newDes) {
        description = newDes;
    }

    public void setDue(String newDue) {
        dueDate = newDue;
    }

    public void setCourse(String newCourse) {
        course = newCourse;
    }
}
