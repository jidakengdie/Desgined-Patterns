import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void Attach(Observer Observer);

    public void Detach(Observer Observer);

    public void Notify();
}

interface Observer {
    public void Update();
}

class ConcreteSubject implements Subject {
    private List<Observer> Observers = new ArrayList<Observer>();
    private String state;

    @Override
    public void Attach(Observer o) {
        Observers.add(o);
    }

    @Override
    public void Detach(Observer o) {
        Observers.remove(o);
    }

    @Override
    public void Notify() {
        for (Observer o : Observers) {
            o.Update();
        }
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
}

class ConcreteObserver implements Observer {
    private String name;
    private String observerstate;
    private ConcreteSubject subject;

    ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    /**
     * @return the subject
     */
    public ConcreteSubject getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void Update() {
        observerstate = subject.getState();
        System.out.println("ObserverState is " + observerstate + ",  and its name is " + name);
    }

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        // cs.Attach(new ConcreteObserver("Luo",cs));
        // cs.Attach(new ConcreteObserver("Xiang",cs));
        // cs.Notify();

        // cs.setState("happy");
        // cs.Notify();
        ConcreteObserver co = new ConcreteObserver("Min", cs);
        cs.Attach(co);
        cs.Notify();
        co.setSubject(new ConcreteSubject());
        cs.Detach(co);
        cs.Notify();
    }
}
