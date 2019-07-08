interface Vistor{
    public void VisitElement1();
    public void VisitElement2();
}

abstract class Element{
    public abstract void Accept(Vistor vistor);
}