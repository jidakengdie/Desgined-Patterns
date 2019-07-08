abstract class Handler {
    protected Handler handler;
    public void SetSuccessor(Handler handler) {
        this.handler = handler;
    }
    public abstract void ConcreteHandler(int request);
}

class ConcreteHandler1 extends Handler {
    public void ConcreteHandler(int request) {
        if (request <= 10) {
            System.out.println(request + " received, Handler1 executed");
        } else {
            handler.ConcreteHandler(request);
        }
    }
}

class ConcreteHandler2 extends Handler {
    public void ConcreteHandler(int request) {
        if (request <= 20) {
            System.out.println(request + " received, Handler2 executed");
        } else {
            System.out.println(request + " is a error request");
        }
    }
}