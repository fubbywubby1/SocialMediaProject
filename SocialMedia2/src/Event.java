import java.util.Date;

/**
 * An extension of MediaItem,
 * except it has a location and date
 * 
 * @author Alexander Simonson and Molly O'Brien
 */
public class Event extends MediaItem {
    private String location;
    private Date date;

    /**
     * initializes all instance vars
     * @param title is initialized to instance var title
     * @param description is initialized to instance var description
     * @param location is initialized to instance var location
     * @param date is initialized to instance var date
     */
    public Event(String title, String description, String location, Date date) {
        super(title, description);
        this.location = location;
        this.date = date;
    }

    /**
     * returns instance var date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * returns instance var location
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * sets date to a new date
     * @param newDate is used to initialize a new date
     */
    public void setDate(Date newDate) {
        date = newDate;
    }

    /**
     * sets location to a new location
     * @param newLocation is used to initialize a new location
     */
    public void setLocation(String newLocation) {
        location = newLocation;
    }

    /**
     * prints the respective values of the instance variables
     */
    @Override
    public String print() {
        return super.getTitle() + super.getDescription() + location + date.toString();
    }
}
