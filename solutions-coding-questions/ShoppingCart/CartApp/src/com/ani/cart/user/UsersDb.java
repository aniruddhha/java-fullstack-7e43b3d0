package com.ani.cart.user;

public class UsersDb {

    public static final int NO_MORE_SPACE = 890;
    public static final int USER_ALREADY_EXISTS = 990;
    public static final int USER_SUCCESSFULLY_CREATED= 1001;

    // our users that we will create from users menu,
    // those users will be stored here
    private static final User[] users = new User[5];    

    public static int addNewUser(int id, String name) {

        int emptyPos = getEmptyPosition();
        if(emptyPos == -1) {
            return NO_MORE_SPACE;
        }

        // check user availability
        int pos = isExists(id);
        if(pos != -1) return USER_ALREADY_EXISTS;
      
        // we have reached this line means, there is space and user is fresh
        // supplied userid is fresh
        User user = new User(id, name);
        users[emptyPos] = user;
        return USER_SUCCESSFULLY_CREATED;
    }

    public static User[] listUsers() {
        return users;
    }

    private static int isExists(int id) {
        for ( int i = 0; i < users.length; i++  ) {
            User user = users[i];
            if(user != null)
                if(user.getId() == id) return i; // already exists
        }
        return -1; // supplied id is fresh
    }

    private static int getEmptyPosition() {
        for ( int i = 0; i < users.length; i++  ) {
            User user = users[i];
            if(user == null) {
                return i; // at the ith location, block is empty
            }
        }
        return -1; // there is no empty position
    }   
}
