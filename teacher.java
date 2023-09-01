public class Teacher {
    private static int id = 0;
    private static String name = new String("");
    private static String course = new String("");

    public static void Teacher(int teachId, String teachName, String teachCourse) {
        id = teachId;
        name = teachName;
        course = teachCourse;
    }

    public String getTeachName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public void setTeachName(String newName) {
        this.name = newName;
    }

}
