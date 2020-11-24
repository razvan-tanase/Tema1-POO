package user;

import fileio.UserInputData;

import java.util.ArrayList;
import java.util.Map;

public class User {
    /**
     * User's username
     */
    private String username;
    /**
     * Subscription Type
     */
    private String subscriptionType;
    /**
     * The history of the movies seen
     */
    private Map<String, Integer> history;
    /**
     * Movies added to favorites
     */
    private ArrayList<String> favoriteMovies;

    public User(UserInputData users) {
        this.username = users.getUsername();
        this.subscriptionType = users.getSubscriptionType();
        this.history = users.getHistory();
        this.favoriteMovies = users.getFavoriteMovies();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public void setHistory(Map<String, Integer> history) {
        this.history = history;
    }

    public String getUsername() {
        return username;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public Map<String, Integer> getHistory() {
        return history;
    }

    public ArrayList<String> getFavoriteMovies() {
        return favoriteMovies;
    }
}
