package templatemethod;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestePlayList {

    private List<Music> playList;

    @Before
    public void setupList() {
        playList = new ArrayList<Music>();

        Music m1 = new Music("Skank", "Te Ver", 1994);
        Music m2 = new Music("Roupa Nova", "Anjo", 1983);
        Music m3 = new Music("Capital Inicial", "Independência", 1987);

        playList.add(m1);
        playList.add(m2);
        playList.add(m3);
    }

    @Test
    public void testePlayListOrderedByName() {
        PlayList p1 = new PlayListByName(new ArrayList<Music>(playList));

        p1.prepare();

        Music m1 = p1.next();
        Music m2 = p1.next();
        Music m3 = p1.next();

        assertEquals(m1, playList.get(1));
        assertEquals(m2, playList.get(2));
        assertEquals(m3, playList.get(0));
    }

    @Test
    public void testePlayListOrderedByAuthor() {
        PlayList p1 = new PlayListByAuthor(new ArrayList<Music>(playList));

        p1.prepare();

        Music m1 = p1.next();
        Music m2 = p1.next();
        Music m3 = p1.next();

        assertEquals(m1, playList.get(2));
        assertEquals(m2, playList.get(1));
        assertEquals(m3, playList.get(0));
    }

    @Test
    public void testePlayListOrderedByYear() {
        PlayList p1 = new PlayListByYear(new ArrayList<Music>(playList));
        p1.prepare();

        Music m1 = p1.next();
        Music m2 = p1.next();
        Music m3 = p1.next();

        assertEquals(m1, playList.get(1));
        assertEquals(m2, playList.get(2));
        assertEquals(m3, playList.get(0));
    }
}
