public class Test {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.SetSuccessor(handler2);
        for (int i = 0; i < 23; i++) {
            handler1.ConcreteHandler(i);
        }
    }
}