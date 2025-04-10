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
    public Ad(String title, String description, String url) {
        super(title, description);
        this.URL = setURL(url);
    }

    /**
     * returns instance var url
     * @return url
     */
    public URL getURL() {
        return URL;
    }

    /**
     * sets url to a new url 
     * @param newURL is used to initialize a new url using a string input
     */
    public void setURL(String url) {
        this.URL = new URL(url);
    }
}
