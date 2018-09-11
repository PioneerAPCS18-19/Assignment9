
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Book
{
    private String title;
    private String author;
    private int year;
    private boolean rented;

    /**
     * Constructor
     *
     * @param title, author, year
     */
    // Implementation




    /**
     * rentBook
     *
     * @param none
     * @return none
     *
     * This Book is marked as rented.
     */
    // Implement this method





    /**
     * returnBook
     *
     * @param none
     * @return none
     *
     * This Book is set as not rented.
     */
    // Implement this method





    /**
     * isBorrowed
     *
     * @param none
     * @return returns true if this Book is rented, false otherwise.
     */
    // Implement this method





    /**
     * getTitle 
     *
     * @param none
     * @return the title of this Book
     */
    // Implement this method




    /**
     * getAuthor
     *
     * @param none
     * @return the author of this Book
     */
     // Implement this method
   



    /**
     * getYear
     *
     * @param none
     * @return year of publication of this Book
     */
     // Implement this method
    
    


    
    
    /* DO NOT EDIT ANYTHING BELOW HERE */
   
    
    /**
     * toString
     *
     * @param none
     * @return String representation of this object
     */
    @Override
    public String toString()
    {
        return getTitle() + " by " + getAuthor() + "(" + getYear() + ")";
    }
}
