import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    // Define variables
    private List<Long> ISBNList;

    public BookDatabase() {
        // Make a resizable array to contain ISBNs
        this.ISBNList = new ArrayList<Long>();
        // Add items to the array
        this.ISBNList.add(1111111111111L);
        this.ISBNList.add(2222222222222L);
        this.ISBNList.add(3333333333333L);
    }

    // Make a function to add items to the array
    public void addISBN(long newISBN) {
        this.ISBNList.add(newISBN);
    }

    // Look through each item in the array using a for loop and print them out
    public void printISBN_Array() {
    for (long isbn : ISBNList) {
        System.out.println(isbn);
    }
}

    // Check if the item exists
    public boolean checkISBN(long isbnToCheck) {
        return ISBNList.contains(isbnToCheck);
    }
}
