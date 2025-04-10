/**
 * A class that defines a mediaitem, 
 * the class itself should not have any objects of it,
 * but instead it should have objects of its subclasses
 * that are then used in polymorphic collections
 * 
 * @author Alexander Simonson & Molly O'Brien
 */
public class MediaItem {
    private String title;
    private String description;

    /**
     * initializes the inputted title to title and description to description
     * @param title is initialized to instance var title
     * @param description is initialized to instance var description
     */
    public MediaItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * returns instance var title
     * @return instance var title
     */
    public String getTitle() {
        return title;
    }

    /**
     * returns instance var description
     * @return instance var description
     */
    public String getDescription() {
        return description;
    }

    /**
     * sets a new value to title
     * @param newTitle is initialized to instance var title
     */
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    /**
     * sets a new value to description
     * @param newDescription is initialized to instance var description
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /**
     * prints the respective values of the instance variables
     */
    public String print() {
        return (title + description);
    }
}
