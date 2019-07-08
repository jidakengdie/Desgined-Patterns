public class Test{
    public static void main(String[] args){
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorate1 concreteDecorate1 = new ConcreteDecorate1();
        ConcreteDecorate2 concreteDecorate2 = new ConcreteDecorate2();

        concreteDecorate1.setComponent(component);
        concreteDecorate2.setComponent(concreteDecorate1);
        concreteDecorate2.Operation();
    }
}