package templatemethod;

import java.util.Comparator;
import java.util.List;

public class PlayListByName extends PlayList {
    public PlayListByName(List<Music> playList) {
        super(playList);
    }

    @Override
    protected void order() {
        Comparator<Music> comparator = new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };

        musics.sort(comparator);
    }
}
