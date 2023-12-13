/**
 * Magazine class used for creating magazine objects to be placed in generic containers.
 *
 * @author Bennett Fife
 * @version 11/2/2023
 */
public class Magazine extends MediaItem {

    private final String title;
    private final String issueNumber;
    private final String month;
    private final boolean NSCCollection;

    /**
     *
     * @param title title of the magazine
     * @param issueNumber issue number of the magazine
     * @param month release month of the magazine
     * @param NSCCollection is the magazine part of NSC's collection
     */
    public Magazine(String title, String issueNumber, String month, boolean NSCCollection){
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.NSCCollection = NSCCollection;
    }

    /**
     * toString to print object details
     * @return details of the magazine
     */
    @Override
    public String toString() {
        return "Magazine: " + title + ", Issue #" + issueNumber + ", Month: " + month + ", NSC Collection: " + NSCCollection;
    }
}
