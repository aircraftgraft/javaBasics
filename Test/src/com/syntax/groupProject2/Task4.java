package com.syntax.groupProject2;

public class Task4 {
    /*
    Create Registration Class in which you would have variables as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods and in each method separately
    pass values to set users email, username and password.
    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
    */
}

class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    void setEmail(){
        if (email.endsWith("yahoo.com")) {
            System.out.println("Email "+email+" is set");
        } else {
            System.out.println("Incorrect email type");
        }
    }
    void setUserName(){
        if(userName.isEmpty()){
            System.out.println("User name field cannot be empty");
        } else if (userName.length()<6) {
            System.out.println("User name cannot be less than 6 characters");
        } else {
            System.out.println("User name "+userName+" accepted");
        }
    }
    void setPassword(){
        if(password.isEmpty()){
            System.out.println("Password field cannot be empty");
        } else if (password.length()<6) {
            System.out.println("Password cannot be less than 6 characters");
        } else if (password.contains(userName)) {
            System.out.println("Password can't contain username. Please create a different password");
        } else {
            System.out.println("Your password accepted");
        }
    }

    public static void main(String[] args) {
        Registration a=new Registration("bibi@yahoo.com", "kfgjfjfkhgctr", "bibi2020");
        a.setEmail();
        a.setUserName();
        a.setPassword();
    }
}
