import com.sun.source.tree.IfTree;

class Aviary {
//    public void release(Bird b){
////        b.fly();
////        System.out.println("Released");
//    }

    public void release(IFlyable iFlyable){
        iFlyable.fly();
        System.out.println("Released");
    }
}