import org.junit.Assert;
import org.junit.Test;

public class SongTest {
    @Test
    public void testConstructor() {
        Song song = new Song("The Lonely Island", "Jack Sparrow", 19);
    }

    @Test
    public void testEquals() {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song otherSong = new Song("Bohemian Rhapsody", "Queen", 112);
        
        Assert.assertEquals(jackSparrow,jackSparrow);
        Assert.assertEquals(jackSparrow, anotherSparrow);
        Assert.assertEquals(anotherSparrow, anotherSparrow);
        Assert.assertNotEquals(jackSparrow, otherSong);
    }
}
