package ex45.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // make instance of TextManipulator
        TextManipulator text = new TextManipulator();
        // path
        String path = "src/main/java/ex45/base/";
        // store newText in String
        String newText = text.replaceUtilizeWithUse(path + "exercise45_input.txt");
        // get User Input
        System.out.println("What do you want to name your file: ");
        // generate new File from user input
        text.generateNewFile(path + in.nextLine(), newText);
    }
}
