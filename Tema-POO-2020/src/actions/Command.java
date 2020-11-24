package actions;

import user.User;
import common.Constants;
import fileio.ActionInputData;

public class Command extends Action {
    /**
     * Used for commands
     */
    private final String type;
    /**
     * Username of user
     */
    private final String username;
    /**
     * Video title
     */
    private final String title;
    /**
     * Grade for rating - aka value of the rating
     */
    private final double grade;
    /**
     * Season number
     */
    private final int seasonNumber;

    public Command(ActionInputData actions) {
        super(actions);
        this.type = actions.getType();
        this.username = actions.getUsername();
        this.title = actions.getTitle();
        this.grade = actions.getGrade();
        this.seasonNumber = actions.getSeasonNumber();
    }

    public String getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public double getGrade() {
        return grade;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public String performCommand(User user) {
        switch (type) {
            case Constants.FAVORITE:
                if (!user.getHistory().containsKey(title)) {
                    return Constants.ERROR + title + Constants.SEEN;
                } else if (user.getFavoriteMovies().contains(title)) {
                    return Constants.ERROR + title + Constants.ALREADY;
                }

            case Constants.VIEW:
            case Constants.RATING:
            default: return "";
        }
    }
}
