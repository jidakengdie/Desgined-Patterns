public class Test {
    public static void main(String[] args) {
        Factory factory1 = new AddFactory();
        Factory factory2 = new SubtractFactory();
        Factory factory3 = new MultiplyFactory();
        Factory factory4 = new DivideFactory();
        // AddOperation add = factory1.CreatOperation();
        // SubtractOperation subtract = factory2.CreatOperation();
        // MultiplyOperation multiply = factory3.CreatOperation();
        // DivideOperation divide = factory4.CreatOperation();
        System.out.println(factory1.CreatOperation().GetResult());
        System.out.println(factory2.CreatOperation().GetResult());
        System.out.println(factory3.CreatOperation().GetResult());
        System.out.println(factory4.CreatOperation().GetResult());
    }
}