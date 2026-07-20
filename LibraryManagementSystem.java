package Java_3.java_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void displayBooks(List<String> bookNames,
                                    List<String> authorNames,
                                    List<Boolean> availabilityStatus) {

        System.out.println("\n=== Library Books ===");

        for (int i = 0; i < bookNames.size(); i++) {
            System.out.println("Book Name : " + bookNames.get(i));
            System.out.println("Author    : " + authorNames.get(i));
            System.out.println("Status    : " +
                    (availabilityStatus.get(i) ? "Available" : "Unavailable"));
            System.out.println("-");
        }
    }

    public static void searchBook(List<String> bookNames, String bookName) {

        boolean found = false;

        for (String book : bookNames) {
            if (book.equalsIgnoreCase(bookName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Book found in the library.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void borrowBook(List<String> bookNames,
                                  List<Boolean> availabilityStatus,
                                  String bookName) {

        for (int i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {

                if (availabilityStatus.get(i)) {
                    availabilityStatus.set(i, false);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is currently unavailable.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void returnBook(List<String> bookNames,
                                  List<Boolean> availabilityStatus,
                                  String bookName) {

        for (int i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {
                availabilityStatus.set(i, true);
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static int[] countBooks(List<Boolean> availabilityStatus) {

        int availableBooks = 0;
        int unavailableBooks = 0;

        for (boolean status : availabilityStatus) {
            if (status) {
                availableBooks++;
            } else {
                unavailableBooks++;
            }
        }

        return new int[]{availableBooks, unavailableBooks};
    }

    public static void displayReport(List<String> bookNames,
                                     List<Boolean> availabilityStatus) {

        int[] counts = countBooks(availabilityStatus);

        System.out.println("\n========== Library Report ==========");
        System.out.println("Total Books        : " + bookNames.size());
        System.out.println("Available Books    : " + counts[0]);
        System.out.println("Unavailable Books  : " + counts[1]);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> bookNames = new ArrayList<>();
        List<String> authorNames = new ArrayList<>();
        List<Boolean> availabilityStatus = new ArrayList<>();

        bookNames.add("Java Programming");
        authorNames.add("James Gosling");
        availabilityStatus.add(true);

        bookNames.add("Python Basics");
        authorNames.add("Guido van Rossum");
        availabilityStatus.add(true);

        bookNames.add("C++ Fundamentals");
        authorNames.add("Bjarne Stroustrup");
        availabilityStatus.add(false);

        bookNames.add("Database Systems");
        authorNames.add("Thomas Connolly");
        availabilityStatus.add(true);

        bookNames.add("Operating Systems");
        authorNames.add("Abraham Silberschatz");
        availabilityStatus.add(true);

        bookNames.add("Computer Networks");
        authorNames.add("Andrew Tanenbaum");
        availabilityStatus.add(false);

        bookNames.add("Software Engineering");
        authorNames.add("Ian Sommerville");
        availabilityStatus.add(true);

        bookNames.add("Web Development");
        authorNames.add("Jon Duckett");
        availabilityStatus.add(true);

        bookNames.add("Artificial Intelligence");
        authorNames.add("Stuart Russell");
        availabilityStatus.add(false);

        bookNames.add("Cyber Security");
        authorNames.add("William Stallings");
        availabilityStatus.add(true);

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Display All Books");
            System.out.println("2. Search for a Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Display Library Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    displayBooks(bookNames, authorNames, availabilityStatus);
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    String searchName = input.nextLine();
                    searchBook(bookNames, searchName);
                    break;

                case 3:
                    System.out.print("Enter book name to borrow: ");
                    String borrowName = input.nextLine();
                    borrowBook(bookNames, availabilityStatus, borrowName);
                    break;

                case 4:
                    System.out.print("Enter book name to return: ");
                    String returnName = input.nextLine();
                    returnBook(bookNames, availabilityStatus, returnName);
                    break;

                case 5:
                    displayReport(bookNames, availabilityStatus);
                    break;

                case 6:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        input.close();
    }
}
