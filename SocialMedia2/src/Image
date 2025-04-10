import java.io.File;

/**
 * An extension of MediaItem,
 * except it has an image file
 * 
 * @author Alexander Simonson and Molly O'Brien
 */
public class Image extends MediaItem{
    private File file;

    /**
     * initializes all instance vars
     * @param title is initialized to instance var title
     * @param description is initialized to instance var description
     * @param fileName is used to create a new file
     */
    public Image(String title, String description, String fileName) {
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
     * sets a new file using input
     * @param newFileName is used to create a new file
     */
    public void setFile(String newFileName) {
        file = new File(newFileName);
    }

    /**
     * prints the respective values of the instance variables
     */
    @Override
    public String print() {
        return super.getTitle() + super.getDescription() + file.toString();
    }
}
