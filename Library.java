import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Library
{
    // Instance variables
    private String address;
    private final double FINE = 0.25;
    private List<Book> catalog = new ArrayList<>();

    /**
     * Constructor
     *
     * @param library's address as Stirng
     * The instance variable address is initialized to parameter.
     */
    // Your implementation...



    /**
     * printAddress
     *
     * @param none
     * @return none
     * The library's address is printed to the console.
     */
     // Your implementation...
    






    
    
    /* DO NOT EDIT ANYTHING BELOW HERE */
    
    
    /**
     * addBook
     *
     * @param Book object being added
     * @return none
     *
     * Book object is added to catalog
     */
    public void addBook(Book book)
    {
        catalog.add(book);
    }

    /**
     * borrowBook
     *
     * @param title of book
     * @return none
     *
     * prints to console whether book is already rented, if it is not in the catalog, or if it has been rented successfully.
     */
    public void borrowBook(String title)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equalsIgnoreCase(catalog.get(i).getTitle()))
            {
                if(catalog.get(i).isBorrowed())
                {
                    System.out.println("\"" + catalog.get(i).getTitle() + "\" is already rented from "
                            + this);

                    return;
                }

                else
                {
                    System.out.println("You successfully rented \"" + catalog.get(i).getTitle() + "\" from " + this);
                    catalog.get(i).rented();
                    return;
                }
            }
        }

        System.out.println("\"" + title + "\" is not in the catalog at " + this);
    }

    /**
     * printAvailableBooks
     *
     * @param none
     * @return none
     *
     * Post: prints to console whether no books are in the catalog or prints the list of books (and says if they are currently rented).
     */
    public void printAvailableBooks()
    {
        if(catalog.size() == 0)
        {

            return;
        }

        System.out.println("List of books at " + this + ":");
        for(int i = 0; i < catalog.size(); i++)
        {
            if(catalog.get(i).isBorrowed())
            {
                System.out.println("\"" + catalog.get(i) + "\" -- OUT OF STOCK");
            }

            else
                System.out.println("\"" + catalog.get(i) + "\"");
        }
    }

    /**
     * returnBook
     *
     * @param title of book being returned, number of days late
     * @return none
     *
     * Book with title is marked as returned and the fine amount is given, which is FINE * daysLate
     */
    public void returnBook(String title, int daysLate)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equalsIgnoreCase(catalog.get(i).getTitle()))
            {
                catalog.get(i).returned();
                System.out.println("You successfully returned \"" + catalog.get(i).getTitle() + "\" to " + this);
                System.out.println("Your book was " + daysLate + " days late. You owe $"
                        + (daysLate * FINE));
                        
                return;
            }
        }

        System.out.println("That book is not part of our catalog.");
        System.out.println("Are you sure you rented that book from this " + this + "?");
    }
    
    /**
     * toString
     *
     * @param none
     * @return String representation of this object
     */
    @Override
    public String toString()
    {
        return "Library (" + address + ")";
    }
}
