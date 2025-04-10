import java.io.File;

/**
 * An extension of MediaItem,
 * except this has a video file
 * 
 * @author Alexander Simonson and Molly O'Brien
 */
public class Video extends MediaItem {
    private File file;

    /**
     * initializes all the instance vars to their respective inputs
     * @param title is initialized to instane var title
     * @param description is initialized to instance var description
     * @param fileName is used to create a new file then initialize it 
     */
    public Video(String title, String description, String fileName) {
        super(title, description);
        file = new File(fileName);
    }

    /**
     * returns instance var file
     * @return file
     */
    public File getFile() {
        return file;
    }

    /**
     * sets file to a new file using a string input
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
        return super.getTitle() + super.getDescription() + file.toString();
    }
}
