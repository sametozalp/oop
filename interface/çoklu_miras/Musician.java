package çoklu_miras;

public interface Musician extends Artist{
     
    @Override
    default void play() {
        System.out.println("Musician plays!");
    }
}
