public class Square extends Shape {

    int side;
    Square(int side){
        this.side = side;
    }

    @Override
    int area() {
        return side*side;
    }
//    @Override void setWidth(int w){
////        this.w = this.h = w;
//        this.w = w;
//    }
//    @Override void setHeight(int h){
////        this.w = this.h = h;
//        this.h = h;
//    }
    /*
    * client shld not wantendlky set side of sqaure 2 times to width and height separtly
    * */

}