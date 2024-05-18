public class abstraction {
    public static void main(String[] args) {
        BBB obj=new BBB();
        obj.add();
        obj.sub();
        CCC obj2=new CCC();
        obj2.add();
        obj2.sub();
    }
}
abstract class AA{
    abstract void add();
    abstract void sub();
}
abstract class BB extends AA {

    void add() {
        System.out.println("AA");
    }
}
class BBB extends BB{
    void sub() {
        System.out.println("BBB");
    }
}
abstract class CC extends AA{
        void add(){
        System.out.println("hello");
    }
}
class CCC extends CC{
    void sub() {
        System.out.println("hi");
    }
}