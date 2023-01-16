package OOPs;

/**
 *
 * Create the Song class which represents a song on a streaming service.
 * The class should have the following attributes:
 * artist - string representing who sings the song
 * title - string representing the name of the song
 * album - string representing the album on which the song appears
 * playCount - integer representing how many times the song has been played
 * payRate - a constant double that represents how much money the artist receives
 * each time a song is played
 * moneyEarned a double representing how much money the song has earned the artist
 *
 * All attributes should have a getter method, and all attributes except for payRate
 * and moneyEarned should have a setter method. Use the Java convention for naming
 * the getters and setters. Users should be able to call the play method which updates
 * the playCount and moneyEarned attributes.
 *
 */
class Song {
    private String artist;
    private String title;
    private String album;
    private int playCount;
    private final double payRate;
    private double moneyEarned;

    public Song(String ar, String t, String al, double p) {
        artist = ar;
        title = t;
        album = al;
        playCount = 0;
        payRate = p;
        moneyEarned = 0;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist) {
        artist = newArtist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String newAlbum) {
        album = newAlbum;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int newPlayCount) {
        playCount = newPlayCount;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public double getPayRate() {
        return payRate;
    }

    public void play() {
        updatePlayCount();
        updateMoneyEarned();
    }

    private void updatePlayCount() {
        playCount++;
    }

    private void updateMoneyEarned() {
        moneyEarned = playCount * payRate;
    }

}
//add class definitions above this line


