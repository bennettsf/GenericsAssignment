/**
 * DVD class used for creating DVD objects to be placed in generic containers.
 *
 * @author Bennett Fife
 * @version 11/2/2023
 */
public class DVD extends MediaItem{
    private final String title;
    private final String duration;
    private final String genre;
    private final boolean NSCCollection;

    /**
     *
     * @param title title of the DVD
     * @param duration duration in minutes of the DVD
     * @param genre genre of the DVD
     * @param NSCCollection is the DVD part of NSC's collection
     */
    public DVD(String title, String duration, String genre, boolean NSCCollection){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.NSCCollection = NSCCollection;
    }

    /**
     * toString to print object details
     * @return details of the DVD
     */
    @Override
    public String toString() {
        return "DVD: " + title + ", Duration: " + duration + " minutes, Genre: " + genre + ", NSC Collection: " + NSCCollection;
    }
}
