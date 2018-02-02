package templatemethod;

import java.util.Comparator;
import java.util.List;

public class PlayListByAuthor extends PlayList {
    public PlayListByAuthor(List<Music> playList) {
        super(playList);
    }

    @Override
    protected void order() {
        Comparator<Music> comparator = new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
            }
        };

        musics.sort(comparator);
    }
}
