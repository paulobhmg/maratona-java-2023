package com.paulo.devdojo.m03_exceptions;

import com.paulo.devdojo.m03_exceptions.domain.InvalidUserException;

import java.util.Scanner;

public class A104_CustomizedException {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your username: ");
        String user = in.nextLine();
        System.out.println("Enter your password: ");
        String password = in.nextLine();

        try{
            signin(user, password);
        } catch(InvalidUserException e) {
            System.out.println("Login error: " + e.getMessage());
        }
    }

    public static void signin(String user, String password) throws InvalidUserException {
        if(!user.equalsIgnoreCase("paulo") || !password.equals("ptanbh")) {
            throw new InvalidUserException("User invalid");
        }
        System.out.println("Welcome " + user + ". Your login was successfull.");
    }
}
