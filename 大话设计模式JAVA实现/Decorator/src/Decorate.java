interface Component{
    void Operation();
}

class ConcreteComponent implements Component{
    public void Operation(){
        System.out.println("ConcreteComponent");
    }
}

class Decorate implements Component{
    Component component = null;
    public void setComponent(Component component){
        this.component = component;
    };
    public void Operation(){
        System.out.println("Decorate");
    }
}

class ConcreteDecorate1 extends Decorate{
    public void Operation(){
        super.Operation();
        System.out.println("ConcreteDecorate1");
    }
}

class ConcreteDecorate2 extends Decorate{
    public void Operation(){
        super.Operation();
        System.out.println("ConcreteDecorate2");
    }
}