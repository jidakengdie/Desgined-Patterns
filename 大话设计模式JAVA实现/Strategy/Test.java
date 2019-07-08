public class Test{
    public static void main(String[] args){
        Context context = new Context(new Strategy1());
        context.ContextInterface();
        // Context context = new Context(new Strategy2());
        // context.ContextInterface();
    }
}