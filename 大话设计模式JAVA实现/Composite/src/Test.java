public class Test{
    public static void main(String[] args) {
        Composite concreteComposite = new ConcreteComposite("Luo", 0);
        Composite concreteComposite2 = new Leaf("Zhang");
        Composite concreteComposite3 = new ConcreteComposite("Xiang");
        Composite concreteComposite4 = new Leaf("Qing");
        Composite concreteComposite5 = new Leaf("Yang");
        concreteComposite.Add(concreteComposite2);
        concreteComposite.Add(concreteComposite3);
        concreteComposite3.Add(concreteComposite4);
        concreteComposite3.Add(concreteComposite5);
        concreteComposite.Display();
    }
}