package Day13_Elaboration_themes_past_days;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        user1.subscribe(user2);
        user2.subscribe(user1);
        user1.subscribe(user3);
        user3.subscribe(user1);
//        System.out.println(user1.isSubscribed1(user2));
//        System.out.println(user2.isSubscribed1(user1));
//
//        System.out.println(user1.showInfoSubscriptions());
//        System.out.println(user2.showInfoSubscriptions());
//
//        System.out.println(user1.getSubscriptions());
//        System.out.println(user2.getSubscriptions());
//
//        System.out.println(user2.isFriend(user1));
//
//        Message testObjectMessage = new Message(user1, user2, "23");
//        System.out.println(testObjectMessage);

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Дела отлично");
        user2.sendMessage(user1, "Благодарю!");

        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Ты тут?");

        user1.sendMessage(user3, "Да");
        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Отлично, благодарю!");

        user3.sendMessage(user1, "Спасибо что написал, удачи!");

        //System.out.println(MessageDatabase.getMessages());
        MessageDatabase.showDialog(user3, user1);
    }
}