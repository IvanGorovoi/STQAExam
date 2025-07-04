public class Song {
    private double songLength;
    private String songName;
    private String authorName;

    private MusicPlayer mp;

    public Song(double songLength, String songName, String authorName, MusicPlayer mp) {
        this.songLength = songLength;
        this.songName = songName;
        this.authorName = authorName;
        this.mp = mp;
    }

    public void playSong(){
        mp.setSong(this.songName);
    }

    public void nextSong(){
        mp.nextSong();
    }

    public MusicPlayer getMp() {
        return mp;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
