public class Test{
    public static void main(String[] args) {
        Prototype prototype = new Text("111");
        Prototype prototype1 = prototype.copy();
        System.out.println(prototype.opt + prototype);
        System.out.println(prototype1.opt + prototype1);
    }
}