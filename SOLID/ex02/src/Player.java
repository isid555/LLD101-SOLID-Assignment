public class Player {
//    private Frame last;
    void play(byte[] fileBytes){
        Decoder decoder = new Decoder();
        DrawUI drawUI = new DrawUI();
        Cached cached = new Cached();

        // decode
//        Frame f = new Frame(fileBytes); // pretend decoding


        Frame f = decoder.decode(fileBytes);

        // draw UI
//        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        drawUI.DrawOnUI(fileBytes);
        // cache
//        System.out.println("Cached last frame? " + (last!=null));
        cached.checkIfCached(f);
    }

    // 3 resp
    /*
    * 1. decoding
    * 2. draw UI
    * 3. cache
    * violateas SRP
    * our goal is to make SRP , if it is an interface soln , then Player shld implement all the things forcefully , even though tht is not the primary role
    *
    * if interfaces , again player is hving more thn one reason to be changd
    * */
}