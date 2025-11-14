package main;

import service.LibraryService;
import model.Book;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService lib = new LibraryService();

        while (true) {
            System.out.println("\n--- Library Management ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(id, title, author));
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
