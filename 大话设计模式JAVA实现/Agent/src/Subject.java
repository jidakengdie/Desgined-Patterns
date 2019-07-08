interface Subject{
    public void Request();
}

class RealSubject implements Subject{
    public void Request(){
        System.out.println("RealSubject here");
    }
}

class Proxy implements Subject{
    private RealSubject realSubject;
    public void Request(){
        realSubject = new RealSubject();
        realSubject.Request();
    }
}