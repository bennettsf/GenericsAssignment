import java.util.ArrayList;
/**
 * Generic class used for creating media containers for the library.
 * The generic uses a bounded type of MediaItem which contains subclasses of DVD, Magazine, and Book
 *
 * @author Bennett Fife
 * @version 11/2/2023
 */

public class NSCLibraryMediaContainer <T extends MediaItem>{
    private final ArrayList<T> container = new ArrayList<>();

    /**
     * Method used to add to the container
     * @param media add generic type media to the ArrayList container
     */
    public void add(T media){
        container.add(media);
    }

    /**
     * Method used to remove from the container
     * @param media remove generic type media from the ArrayList container
     */
    public void remove(T media){
        container.remove(media);
    }

    /**
     * Display the contents of the container
     */
    public void display(){
        for(T media : container){
            System.out.println(media.toString());
        }
    }
}
