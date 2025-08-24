public class Rectangle extends  Shape{

    protected int w,h;
    Rectangle(int w,int h){
        this.w = w;
        this.h = h;
    }

    @Override
    int area() {
        return this.w  * this.h;
    }
//    protected int w,h;
//    void setWidth(int w){ this.w = w; }
//    void setHeight(int h){ this.h = h; }
//    int area(){ return w*h; }
}