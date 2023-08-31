public class work {
    private static int id;
    private static String name;
    private static String description;
    private static String due;
    private static String course;

    public static void work(int workID, String workName, String workDescription, String dueDate,
        String workCourse) {
        id = workID;
        name = workName;
        description = workDescription;
        due = dueDate;
        course = workCourse;
    }
}
