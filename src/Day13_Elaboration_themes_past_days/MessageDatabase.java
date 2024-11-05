package Day13_Elaboration_themes_past_days;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    static private final List<Message> messages = new ArrayList<>();

    public static void sendMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static void showDialog(User u1, User u2) {
        if (u1.isFriend(u2)) {
            for (Message tempMessage : messages) {
                if ((u1 == tempMessage.getSender() && u2 == tempMessage.getReceiver())
                        || (u2 == tempMessage.getSender() && u1 == tempMessage.getReceiver())) {
                    System.out.println(tempMessage.getSender() + ": " + tempMessage.getText());
                }
            }
        } else System.out.println("Пользователи не знакомы");
    }
}