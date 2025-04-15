package socialmedia;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * An extension of mediaitem, except this has
 * an instance of an artist and a song
 * 
 * @author Alexander Simonson & Molly O'Brien
 */
public class Song extends MediaItem{
    private String artist;
    private File file;
    private String fileName;

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
        file = new File("C:/Temp/SocialMedia2/socialmedia2/assets/" + fileName);
        this.fileName = fileName;
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

    /**
     * returns instance var fileName
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Takes in the file, then processes the length of it
     * @return the duration, in seconds, of the song
     */
    public Float getLengthOfFile() {
        AudioFileFormat fileFormat;
        try {
            fileFormat = AudioSystem.getAudioFileFormat(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }

        long audioFileLength = file.length();
        AudioFormat format = fileFormat.getFormat();
        int frameSize = format.getFrameSize();
        float frameRate = format.getFrameRate();
        float durationInSeconds = (audioFileLength / (frameSize * frameRate));

        return durationInSeconds;
    }

    /**
     * converts the instance vars to a String that is used for html
     */
    @Override
    public String toHtml() {
        if (!file.exists()) {
            return "<p style='color:red;'>Audio file not found: " + getFileName() + "</p>";
        }

        String fullPath = file.toURI().toString();

        return "<p><strong>" + getTitle() + "</strong> by " + getArtist() + "<br>" +
            getDescription() + "</p>" +
            "<audio controls style='width: 100%;'>" +
            "<source src='" + fullPath + "' type='audio/wav'>" +
            "Your browser does not support the audio element." +
            "</audio>";
}



}
