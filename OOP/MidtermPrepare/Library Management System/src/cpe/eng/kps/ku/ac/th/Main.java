package cpe.eng.kps.ku.ac.th;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding items to the library
        Book book1 = new Book("The Great Gatsby", "B001", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee");
        DVD dvd1 = new DVD("Inception", "D001", "Christopher Nolan");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);

        // Finding and borrowing an item
        LibraryItem foundItem = library.findItem("B001");
        if (foundItem != null) {
            System.out.println("Found: " + foundItem.getTitle());
            if (library.borrowItem("B001")) {
                System.out.println("Successfully borrowed: " + foundItem.getTitle());
            }
        }

        // Trying to borrow the same item again
        if (!library.borrowItem("B001")) {
            System.out.println("Cannot borrow " + foundItem.getTitle() + " as it's not available");
        }

        // Returning the item
        if (library.returnItem("B001")) {
            System.out.println("Successfully returned: " + foundItem.getTitle());
        }

        // Removing an item
        library.removeItem("D001");
        if (library.findItem("D001") == null) {
            System.out.println("DVD 'Inception' was successfully removed from the library");
        }
    }
}

