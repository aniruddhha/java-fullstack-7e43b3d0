package com.ani.dp;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        User.Builder builder = new User.Builder();

        User user1 = builder.email("abc")
                        .phone("7667464")
                        .build();
        
        System.out.println("Email "+ user1.getEmail() +" Phone " + user1.getPhone());

        User user2 = new User.Builder()
                            .phone("7667464")
                            .build();

        System.out.println("Email "+ user2.getEmail() +" Phone " + user2.getPhone());
    }
}

class User {
    private final String email;
    private final String phone;
    
    private User(Builder builder) {
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder { // this class will implement an iterface
        private String email;
        private String phone;
        
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
     
        public User build() {
            return new User(this); // you have used private constructor
        }
    }
}