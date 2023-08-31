public class teacher {
    private static int id = 0;
    private static String name = new String("");
    private static String course = new String("");

    public static void teacher(int teachId, String teachName, String teachCourse) {
        id = teachId;
        name = teachName;
        course = teachCourse;
    }
}
