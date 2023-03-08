package com.ani.cart.user;

public class UsersDb {
    // our users that we will create from users menu,
    // those users will be stored here
    public static final User[] users = new User[5];    

    public static int addNewUser(int id, String name) {
        // check user availability
        for(User user : users) {
            if(user.getId() == id) {
                return -1; // if supplied userid is existing
            }
        }

        // supplied userid is fresh
        User user = new User(id, name);

        return 1;
    }
}
