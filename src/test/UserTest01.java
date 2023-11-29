package test;

import domain.User;

public class UserTest01 {

    public static void main(String[] args) {

        User user = new User();
        System.out.println("Welcome to User Area!");
        user.name = "Charles";
        user.email = "charlie2023@gmail.com";

        System.out.println("------------ User 1 ------------");
        System.out.println("Name: "+ user.name);
        System.out.println("Email: "+ user.email);
        System.out.println("---------------------------------");

    }

}
