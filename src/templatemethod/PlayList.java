package templatemethod;

import java.util.Iterator;
import java.util.List;

public abstract class PlayList {

    protected List<Music> musics;
    protected Integer size;
    private Iterator<Music> iterator;

    public PlayList(List<Music> musics) {
        this.musics = musics;
    }

    public void prepare() {
        size = musics.size();

        //o método order será definido nas subclasses
        //não alterando a estrutura do método prepare
        order();

        iterator = musics.iterator();

        //setTime();
    }

    public Music next() {
        return iterator.next();
    }

    protected abstract void order();

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
}
