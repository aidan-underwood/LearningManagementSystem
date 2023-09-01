public class Student {
    private static int id = 0;
    private static String name = new String();
    private static String[] courses = new String[8];

    public static void Student(int stuID, String stuName, String[] stuCourses) {
        id = stuID;
        name = stuName;
        for (int i = 0; i <= 8; i++) {
            courses[i] = stuCourses[i];
        }
    }

    public String getStuName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setStuName(String newName) {
        this.name = newName;
    }

}
