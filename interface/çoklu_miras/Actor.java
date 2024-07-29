package çoklu_miras;

public interface Actor extends Artist {
    @Override
    default void play() {
        System.out.println("Actor plays!");
    }
}
