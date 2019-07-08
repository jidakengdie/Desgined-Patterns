interface Mediate {
    public void Send(String message, Colleague colleague);
}

abstract class Colleague {
    protected Mediate mediate;

    Colleague(Mediate mediate) {
        this.mediate = mediate;
    }

    public abstract void Notify(String message);
}

class ConcreteColleague1 extends Colleague {
    ConcreteColleague1(Mediate mediate) {
        super(mediate);
    }

    public void Notify(String message) {
        System.out.println("ConcreteColleague1 received message: " + message);
    }

    public void Send(String message) {
        mediate.Send(message, this);
    }
}

class ConcreteColleague2 extends Colleague {
    ConcreteColleague2(Mediate mediate) {
        super(mediate);
    }

    public void Notify(String message) {
        System.out.println("ConcreteColleague2 received message: " + message);
    }

    public void Send(String message) {
        mediate.Send(message, this);
    }
}

class ConcreteMediate implements Mediate {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void SetColleague1(ConcreteColleague1 colleague) {
        this.colleague1 = colleague;
    }

    public void SetColleague2(ConcreteColleague2 colleague) {
        this.colleague2 = colleague;
    }

    public void Send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.Notify(message);
        } else {
            colleague1.Notify(message);
        }
    }
}
