package socialmedia;
import java.net.URL;

/**
 * An extension of mediaitem, it simply just has a url in addition
 * 
 * @author Alexander Simonson & Molly O'Brien
 */
public class Ad extends MediaItem {
    private URL URL;

    /**
     * initializes title and description through super, declares new url off of inputted String url
     * @param title is initialized to instance var title
     * @param description is initialized to instance var description
     * @param url is used to create a new object url with String as its name
     */
    public Ad(String title, String description, String url) throws Exception  {
        super(title, description);
        this.URL = new URL(url);
    }

    /**
     * returns instance var url
     * @return url
     */
    public URL getUrl() {
        return URL;
    }

    /**
     * prints the respective values of the instance variables
     */
    @Override
    public String print() {
        return super.getTitle() + super.getDescription() + URL;
    }

    /**
     * converts the instance vars to a String that is used for html
     */
    @Override
    public String toHtml() {
        return "<p>" + getTitle() + ": " + getDescription() + "<br>" +
           "<a href='" + getUrl() + "' target='_blank'>Visit Ad</a></p>";
    }
}
