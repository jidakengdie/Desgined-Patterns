import java.util.Hashtable;

interface Flyweight {
    public void Operate(int instance);
}

class OpenFlyweight implements Flyweight {
    @Override
    public void Operate(int instance) {
        System.out.println("ConcreteOpenedFLyweight" + instance);
    }
}

class CloseFlyweight implements Flyweight {
    @Override
    public void Operate(int instance) {
        System.out.println("ConcreteClosedFLyweight" + instance);
    }
}

class FlyweightFactory {
    private Hashtable flyweights = new Hashtable<String, OpenFlyweight>();

    FlyweightFactory() {
        flyweights.put("X", new OpenFlyweight());
        flyweights.put("Y", new OpenFlyweight());
        flyweights.put("Z", new OpenFlyweight());
    }

    public Flyweight GetFlyweight(String instance) {
        return (Flyweight) flyweights.get(instance);
    }
}

public class Test {
    public static void main(String[] args) {
        int number = 4;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.GetFlyweight("X").Operate(number--);
        flyweightFactory.GetFlyweight("Y").Operate(number--);
        flyweightFactory.GetFlyweight("Z").Operate(number--);
        CloseFlyweight cf = new CloseFlyweight();
        cf.Operate(number--);
    }
}