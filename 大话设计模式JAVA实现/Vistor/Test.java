class ConcreteElement1 extends Element {
    @Override
    public void Accept(Vistor vistor) {
        vistor.VisitElement1();
    }

    public void Operate() {
        System.out.println("Element1");
    }
}

class ConcreteElement2 extends Element {
    @Override
    public void Accept(Vistor vistor) {
        vistor.VisitElement2();
    }

    public void Operate() {
        System.out.println("Element2");
    }
}

// 对于能枚举的类别各有两种不同的状态
class ConcreteVistor1 implements Vistor {
    @Override
    public void VisitElement1() {
        System.out.println("happy - Element1");
    }

    @Override
    public void VisitElement2() {
        System.out.println("happy - Element2");
    }
}

class ConcreteVistor2 implements Vistor {
    @Override
    public void VisitElement1() {
        System.out.println("sad - Element1");
    }

    @Override
    public void VisitElement2() {
        System.out.println("sad - Element2");
    }
}

public class Test{
    public static void main(String[] args) {
        ConcreteElement1 ce1 = new ConcreteElement1();
        ConcreteElement2 ce2 = new ConcreteElement2();
        ConcreteVistor1 cv1 = new ConcreteVistor1();
        ConcreteVistor2 cv2 = new ConcreteVistor2();  
        ce1.Accept(cv1);
        ce1.Operate();
        ce2.Accept(cv1);
        ce2.Operate();
        ce1.Accept(cv2);
        ce2.Accept(cv2);
    }
}