/**
 * Main class used for testing the generic containers.
 *
 * @author Bennett Fife
 * @version 11/2/2023
 */
class NSCLibraryTest {

    public static void main(String[] args){

        //create a container of each class type (DVD, Magazine, and Book)
        NSCLibraryMediaContainer<DVD> DVDContainer = new NSCLibraryMediaContainer<>();
        NSCLibraryMediaContainer<Magazine> magazineContainer = new NSCLibraryMediaContainer<>();
        NSCLibraryMediaContainer<Book> bookContainer = new NSCLibraryMediaContainer<>();

        //create book objects and add them to the book container
        Book book1 = new Book("Project Hail Mary", "Andy Weir", "9342410838232", true);
        Book book2 = new Book("Piranesi", "Susanna Clarke", "9843281647823", false);
        bookContainer.add(book1);
        bookContainer.add(book2);

        //use of printMediaDetails
        NSCMediaUtils.printMediaDetails(book1);
        System.out.println();

        //display the contents of bookContainer
        System.out.println("Book Container:");
        bookContainer.display();

        //create DVD objects and add them to the DVD container
        DVD dvd1 = new DVD("Interstellar", "150", "Sci-Fi", false);
        DVD dvd2 = new DVD("Good Will Hunting", "126", "Drama", true);
        DVDContainer.add(dvd1);
        DVDContainer.add(dvd2);
        System.out.println();

        //use of printMediaDetails
        NSCMediaUtils.printMediaDetails(dvd1);
        System.out.println();

        //display the contents of DVDContainer
        System.out.println("DVD Container:");
        DVDContainer.display();

        //create magazine objects and add them to the magazine container
        Magazine mag1 = new Magazine("TIME", "45", "October", false);
        Magazine mag2 = new Magazine("ESPN Magazine", "324", "April", true);
        magazineContainer.add(mag1);
        magazineContainer.add(mag2);
        System.out.println();

        //use of printMediaDetails
        NSCMediaUtils.printMediaDetails(mag1);
        System.out.println();

        //display the contents of magazineContainer
        System.out.println("Magazine Container:");
        magazineContainer.display();
        System.out.println();

        //create a container that can hold all 3 different kinds of media
        NSCLibraryMediaContainer<MediaItem> mediaContainer = new NSCLibraryMediaContainer<>();
        mediaContainer.add(mag1);
        mediaContainer.add(book2);
        mediaContainer.add(dvd1);
        mediaContainer.add(mag2);
        mediaContainer.add(dvd2);
        mediaContainer.add(book1);

        //test removing one of the media items
        mediaContainer.remove(book2);

        //display the contents of mediaContainer
        System.out.println("Media Container:");
        mediaContainer.display();

    }
}