package com.pluralsight;

import java.util.Scanner;

public class Library {
    static Scanner scanner = new Scanner(System.in);

    static Book[] books = loadBooks();

    public static void main(String[] args) {

        //while (true) {
            System.out.println("Pick 1 if you want to see all available books, Pick 2 if you want to check out a book, Pick 3 if you would like to exit the application");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    showAllBooks();
                    break;
                case 2:
                    checkOutBook();
                    break;
                case 3:
                    exitingApplication();
                    break;
                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        //}

    }

    private static void exitingApplication() {
        System.out.println("Exiting application");
        System.exit(0);
    }

    public static void showAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + " " + books[i].getTitle());
        }

    }
    public static void checkOutBook() {
        System.out.println("What book do you want to check out?");
        showAllBooks();
        int bookChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your name?");
        String nameOfCheckOut = scanner.nextLine();
        books[bookChoice].checkOut(nameOfCheckOut);
    }

    public static Book[] loadBooks() {
            return new Book[]{
                    new Book(1, "9780140449136", "The Odyssey", false, ""),
                    new Book(2, "9780439139601", "Harry Potter and the Goblet of Fire", true, "User123"),
                    new Book(3, "9780141439600", "Pride and Prejudice", false, ""),

                    new Book(4, "9780307476463", "The Road", true, "User456"),

                    new Book(5, "9780743273565", "The Great Gatsby", false, ""),

                    new Book(6, "9780553386790", "A Game of Thrones", true, "User789"),

                    new Book(7, "9780061120084", "To Kill a Mockingbird", false, ""),

                    new Book(8, "9780385472579", "Zen and the Art of Motorcycle Maintenance", false, ""),

                    new Book(9, "9780345339706", "The Hobbit", true, "User234"),

                    new Book(10, "9781451673319", "Fahrenheit 451", false, ""),

                    new Book(11, "9780142437230", "Moby-Dick", false, ""),

                    new Book(12, "9780060850524", "Brave New World", true, "User876"),

                    new Book(13, "9780143105985", "Meditations", false, ""),

                    new Book(14, "9780525566151", "Where the Crawdads Sing", false, ""),

                    new Book(15, "9780679783268", "1984", true, "User345"),

                    new Book(16, "9780747532743", "Harry Potter and the Philosopher's Stone", false, ""),

                    new Book(17, "9780812981605", "The Power of Habit", false, ""),

                    new Book(18, "9780307277671", "The Kite Runner", true, "User567"),

                    new Book(19, "9780316769488", "The Catcher in the Rye", false, ""),

                    new Book(20, "9780062315007", "Sapiens: A Brief History of Humankind", true, "User999")

            };
    }
}
