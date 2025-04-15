package socialmedia;
import java.util.Date;
import java.util.HashMap;

/**
 * A collection of MediaItems
 * 
 * @author Alexander Simonson and Molly O'Brien
 */
public class MediaCollection {
    private HashMap<Topic, MediaItem> media = new HashMap<>();

    /**
     * Adds a select few MediaItems that are predetermined
     * @throws Exception malformedURL, for the Ad class
     */
    public MediaCollection() throws Exception {
        this.media.put(Topic.Bacon, new Image("Bacon", "a slice", "bacon.jpg"));
        this.media.put(Topic.Barbies, new Image("Barbie", "in a Barbie world", "barbie.jpeg"));
        this.media.put(Topic.Doritos, new Ad("Doritos", "Cool Ranch", "https://www.doritos.com"));
        this.media.put(Topic.Grapes, new Ad("Grapes", "Straight outta Greece!", "https://www.grapes.com"));
        this.media.put(Topic.Hairstyles, new Image("Hairstyles", "A new cut!", "Hairstyles.jpg"));
        this.media.put(Topic.Hamsters, new Song("Hamster Dance", "Watch a hamster dance!", "Jack Myers", "HamsterDance.wav"));
        this.media.put(Topic.Investments, new Ad("Investments", "The market is crashing!!!", "https://www.RobinHood.com"));
        this.media.put(Topic.Music, new Song("Music", "Melodic and Groovy", "Beethoven", "Music.wav"));
        this.media.put(Topic.Pancakes, new Video("Pancakes", "Scrumdiddlyumptious", "Pancakes.mp4"));
        this.media.put(Topic.Pizza, new Ad("Pizza", "It's-a-from-Italy", "https://www.Pizza.com"));
        this.media.put(Topic.Popcorn, new Song("Popcorn", "Butter and Salt?", "Mozart", "Popcorn.wav"));
        this.media.put(Topic.Romance, new Song("Romance", "Bad Romance", "Led Zeppelin", "BadRomance.wav"));
        this.media.put(Topic.Squirrels, new Image("Squirrels", "My dog doesn't like them", "squirrel.png"));
        this.media.put(Topic.Sugar, new Song("Sugar", "It's addicting", "Chemistry", "Sugar.wav"));
        this.media.put(Topic.Superman, new Event("Superman", "A mighty superhero", "Metropolis", new Date()));
        this.media.put(Topic.Toothpaste, new Video("Toothpaste", "It keeps your teeth squeeky clean", "Toothpaste.mp4"));
        this.media.put(Topic.Travel, new Event("Travel", "Where do you want to go?", "Germany", new Date()));
        this.media.put(Topic.Volkswagons, new Ad("Volkswagons", "The People's Car!", "https://www.Volkswagon.com"));
        this.media.put(Topic.Yachts, new Image("Yachts", "Let's go boatin!", "yacht.jpg"));
    }

    /**
     * Returns the hashmap media
     * @return media
     */
    public HashMap<Topic, MediaItem> getMedia() {
        return media;
    }

    /**
     * finds an item in hashmap media
     * @param key is used to find the item
     * @return the desired element
     */
    public MediaItem getMediaItem(Topic key) {
        if (key != null) {
            return media.get(key);
        } else {
            return null;
        }
    }

}
