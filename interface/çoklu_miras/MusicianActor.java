package çoklu_miras;

public class MusicianActor implements Musician, Actor {

    /*
     * diamond problem ya da deadly diamond of death denir.
     */

    // Bu metodu override etmek zorundayız
    
    @Override
    public void play() {
        Musician.super.play();
    }
}
