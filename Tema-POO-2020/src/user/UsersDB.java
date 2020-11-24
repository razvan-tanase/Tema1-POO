package user;

import fileio.UserInputData;

import java.util.List;

public class UsersDB {
    private final List<UserInputData> usersDB;

    public UsersDB(List<UserInputData> usersDB) {
        this.usersDB = usersDB;
    }

    public List<UserInputData> getUsersDB() {
        return usersDB;
    }

    public UserInputData searchForUser(String username) {
        for (UserInputData userInputData : usersDB) {
            if (username.equals(userInputData.getUsername())) {
                return userInputData;
            }
        }
        return null;
    }
}
