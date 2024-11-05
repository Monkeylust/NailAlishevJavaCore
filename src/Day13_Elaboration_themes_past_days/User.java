package Day13_Elaboration_themes_past_days;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public String toString() {
        return username;
    }

    public String showInfoSubscriptions() {
        return "У пользователя %s есть подписчики %s".formatted(username, subscriptions);
    }

    public void subscribe(User user) {
        subscriptions.add(user);    //В решении this.subscriptions.add(user);
    }

    public boolean isSubscribed1(User user) {
        for (User temp : subscriptions) {
            if (temp.equals(user)) {    //В решении if (temp.getUsername().equals(user.getUsername()))
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed1(user) && user.isSubscribed1(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

//    public boolean isSubscribed2(User user) { // Подсказал Серега
//        return this.subscriptions.contains(user);
//    }
}