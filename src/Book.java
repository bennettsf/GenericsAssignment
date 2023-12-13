/**
 * Book class used for creating book objects to be placed in generic containers.
 *
 * @author Bennett Fife
 * @version 11/2/2023
 */

public class Book extends MediaItem {
    private final String ISBN;
    private final String title;
    private final String author;
    private final boolean NSCCollection;

    /**
     *
     * @param title title of the book
     * @param author author of the book
     * @param ISBN ISBN code of the book
     * @param NSCCollection is the book part of NSC's collection
     */
    public Book(String title, String author, String ISBN, boolean NSCCollection){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.NSCCollection = NSCCollection;
    }

    /**
     * toString to print object details
     * @return details of the Book
     */
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", ISBN: " + ISBN + ", NSC Collection: " + NSCCollection;
    }
}
