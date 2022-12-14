package com.example.test00;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
                    break;
                case "2":

                    break;
                case "3":
                    System.out.println(" EnrolID  \t\t\tFirstName \t\t\tLastName\t\t\t\tAge");
                    System.out.println(" -------        --------------     ----------------          -------");
                    studentManager.show();
                    break;
                case "4":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    private static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add new student.");
        System.out.println("2. Save.");
        System.out.println("3. Display all students.");
        System.out.println("4.  Exit");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

}}
