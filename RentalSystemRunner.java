
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
        firstLibrary.addBook(new Book("The Da Vinci Code", "Dan Brown", 2003));
        firstLibrary.addBook(new Book("Jurassic Park", "Michael Crichton", 1990));
        firstLibrary.addBook(new Book("The Catcher in the Rye", "J. D. Salinger", 1951));
        firstLibrary.addBook(new Book("The Glass Castle", "Jeanette Walls", 2005));
        firstLibrary.addBook(new Book("The Curious Incident of the Dog in the Night-time", "Mark Haddon", 2003));
        secondLibrary.addBook(new Book("1984", "George Orwell", 1949));

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
