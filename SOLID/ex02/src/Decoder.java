public class Decoder {
    public Frame decode(byte[] file){
        System.out.println("Decoding file bytes");
        return  new Frame(file);
    }
}
