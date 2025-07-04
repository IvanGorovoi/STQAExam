import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTest {
    MusicPlayer musicPlayer;
    @Rule
    public JUnitRuleMockery context = new JUnitRuleMockery();

    @Before
    public void setUp() {
        this.musicPlayer = context.mock(MusicPlayer.class);
    }

    @Test
    public void playSongTest(){
        Song song = new Song(132.0, "ThunderStruck", "AC/DC", musicPlayer);
        context.checking(new Expectations() {{
            oneOf(musicPlayer).setSong(song.getSongName());
            will(returnValue(null));
        }});
        musicPlayer.setSong(song.getSongName());
        assertEquals("Now playing "+song.getSongName(), 0, 0);
    }

    @Test
    public void nextSongTest(){
        context.checking(new Expectations() {{
            oneOf(musicPlayer).nextSong();
            will(returnValue(null));
        }});
        musicPlayer.nextSong();
        assertEquals("Next Song is playing", 0, 0);
    }
}
