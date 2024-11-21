package com.solvd.homework1;

public class Task1 {
    public void newUserInfo(String userName, int userAge) {
        System.out.println("New user is " + userName + " and his age is " + userAge);
    }

    public static void main(String[] args) {
        Task1 newUser = new Task1();
        newUser.newUserInfo("Ilya", 25);
    }
}
