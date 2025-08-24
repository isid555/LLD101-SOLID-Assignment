public class Demo06 {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        new Aviary().release(sparrow);
//        new Aviary().release(new Penguin()); // runtime error
    }
}

/*
*
*          Bird
*          /     \
*    Sparrow     Penguin
*      Iflyable
*
* */