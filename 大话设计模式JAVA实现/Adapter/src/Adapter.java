class Target{
    public void TargetRequest(){
        System.out.println("用户目标请求");
    }
}

class ConcreteTarget{
    public void ConcreteTargetRequest(){
        System.out.println("目标具体请求");
    }
}

class Adapter extends Target{
    private ConcreteTarget concretetarget = new ConcreteTarget();
    public void TargetRequest(){
        concretetarget.ConcreteTargetRequest();
    }
}