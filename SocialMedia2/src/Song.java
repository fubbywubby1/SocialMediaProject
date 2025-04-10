import java.io.File;

/**
 * An extension of mediaitem, except this has
 * an instance of an artist and a song
 * 
 * @author Alexander Simonson & Molly O'Brien
 */
public class Song extends MediaItem{
    private String artist;
    private File file;

    /**
     * Initializes all the instance vars to the respective input
     * @param title is initialized to the instance var title
     * @param description is initialized to the instance var description
     * @param artist is initialized to the instance var artist
     * @param fileName is initialized to the instance var file by creating a new file
     */
    public Song(String title, String description, String artist, String fileName) {
        super(title, description);
        this.artist = artist;
        file = new File(fileName);
    }

    /**
     * returns instance var artist
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * returns instance var file
     * @return file
     */
    public File getFile() {
        return file;
    }

    /**
     * sets a new artist
     * @param newArtist is initialized to instance var artist
     */
    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }

    /**
     * sets a new file
     * @param newFileName is used to create a new file
     */
    public void setFile(String newFileName) {
        this.file = new File(newFileName);
    }

    /**
     * prints the respective values of the instance variables
     */
    @Override
    public String print() {
        return super.getTitle() + super.getDescription() + artist + file.toString();
    }
}
