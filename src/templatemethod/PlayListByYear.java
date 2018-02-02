package templatemethod;

import java.util.Comparator;
import java.util.List;

public class PlayListByYear extends PlayList {
    public PlayListByYear(List<Music> playList) {
        super(playList);
    }

    @Override
    protected void order() {
        Comparator<Music> comparator = new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                if(o1.getYear() == o2.getYear())
                    return 0;

                if(o1.getYear() < o2.getYear()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        musics.sort(comparator);
    }
}
