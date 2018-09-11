
/**
 * Write a description of class RentalSystemRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class RentalSystemRunner
{
    public static void main(String[] args)
    {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Library operating hours
        String openingHours = "Libraries are open daily from 9am to 5pm.";

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        secondLibrary.addBook(new Book("The Lord of the Rings"));


        // Print opening hours and the addresses
        System.out.println("Library hours:");
        System.out.println(openingHours);
        




        /* DO NOT EDIT ABOVE THIS LINE */

        System.out.println("Library addresses:");
        // print address for each library 

        
        
        // Print the titles of all available books from both libraries

        
        

        // Try to borrow Jurassic Park from both libraries
        System.out.println("Which book would you like to borrow? ");
        // add your implementation here


        // Print the titles of all available books from both libraries
        // add your implementation here


        // Try to return Jurassic Park to the second library.
        // Then return Jurassic Park to the first library (3 days late)
        System.out.println("Which book would you like to return? ");
        // add your implementation here


        // Print the titles available from both libraries
        // add your implementation here

    }
}
