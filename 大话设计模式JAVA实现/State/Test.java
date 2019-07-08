interface State {
    public void Handele(Context context);
}

class State1 implements State{
    @Override
    public void Handele(Context context) {
        System.out.println(context.number + "State1 响应");
    }
}

class State2 implements State{
    @Override
    public void Handele(Context context) {
        System.out.println(context.number + "State2 响应");
    }
}

class Context {
    private State state;
    public int number;

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    Context(State state , int number) {
        this.state = state;
        this.number = number;
    }

    public void Request() {
        state.Handele(this);
    }
}

public class Test{
    public static void main(String[] args) {
        State1 s1 = new State1();
        State2 s2 = new State2();
        Context ctx1 = new Context(s1, 1);
        Context ctx2 = new Context(s2, 2);
        ctx1.Request();
        ctx1.setState(s2);
        ctx1.Request();
        ctx2.Request();
        ctx2.setState(s1);
        ctx2.Request();
    }
}