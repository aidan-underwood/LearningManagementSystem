import java.util.ArrayList;

public class Discussion {
    private static int ID;
    private static String topic;
    private static ArrayList<String> messages;
    private static ArrayList<Student> members;

    public static void Discussion(int discID, String discTopic, ArrayList<String> discMessages,
        ArrayList<Student> discMembers) {
        ID = discID;
        topic = discTopic;
        messages = discMessages;
        members = discMembers;
    }

    public static void addMember(Student newStudent) {
        members.add(newStudent);
    }

    public static void addMessage(String message) {
        messages.add(message);
    }

    public static int getID() {
        return ID;
    }

    public static String getTopic() {
        return topic;
    }

    public static ArrayList<String> getMessages() {
        return messages;
    }

    public static ArrayList<Student> getMembers() {
        return members;
    }

}
