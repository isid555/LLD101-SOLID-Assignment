
public class Demo05 {
//    static int areaAfterResize(Rectangle r){
//        r.setWidth(5); r.setHeight(4); return r.area();
//    }

    static int getArea(Shape s){
        return  s.area();
    }


    public static void main(String[] args) {
//        System.out.println(areaAfterResize(new Rectangle())); // 20
//        System.out.println(areaAfterResize(new Square()));    // 16 (!) violates expectation
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10,8);
        System.out.println(getArea(square));
        System.out.println(getArea(rectangle));
    }
}
/*
* LSP is violated
*
* */