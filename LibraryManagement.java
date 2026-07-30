import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        LinkedList<String> issuedBooks = new LinkedList<>();

        // Adding books to the library
        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Data Structures");
        books.add("Operating System");
        books.add("Database Management");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. View Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. View Issued Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }

                    System.out.print("Enter book number to issue: ");
                    int bookNo = sc.nextInt();

                    if (bookNo >= 1 && bookNo <= books.size()) {
                        String book = books.remove(bookNo - 1);
                        issuedBooks.add(book);
                        System.out.println(book + " has been issued successfully.");
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    System.out.println("\nIssued Books:");
                    if (issuedBooks.isEmpty()) {
                        System.out.println("No books issued.");
                    } else {
                        for (String book : issuedBooks) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}