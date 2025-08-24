public class Cached {
    Frame last;
    void checkIfCached(Frame frame){
        last = frame;
        System.out.println("Cached last frame? " + (last!=null));
    }
}
