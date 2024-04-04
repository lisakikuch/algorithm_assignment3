import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        BookDatabase myDatabase = new BookDatabase();
        Scanner scanner = new Scanner(System.in);
        long ISBN = 0;
        boolean isValidISBN = false;

        // Ask the user to input a value first and continue the loop until "isValidISBN" is false
        do {
        System.out.println("Enter a 13 digit ISBN number to search: ");
        while (!scanner.hasNextLong()) {
            System.out.println("Invalid input. Please enter a 13 digit ISBN number: ");
            scanner.next();
        }
        ISBN = scanner.nextLong();
        isValidISBN = String.valueOf(ISBN).length() == 13 && myDatabase.checkISBN(ISBN);

        // Ask user to input a value if the input is invalid
        if(!isValidISBN) {
            System.out.println("ISBN is either not 13 digits or does not exist. Please try again.");
        } 

        // Inform the user the input is valid and it is found in the list
        } while (!isValidISBN);
        System.out.println("Valid ISBN was found.");

        scanner.close();
        // Print all items in the array
        myDatabase.printISBN_Array();

        /* Add a new item to the array
        myDatabase.addISBN(4444444444444L);

        // Print all items in the array after editting
        System.out.println("The list after editted: ");
        myDatabase.printISBN_Array();*/

    }
}