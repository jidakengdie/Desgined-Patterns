class Child1{
    public void Method1(){
        System.out.println("Method1");
    }
}

class Child2{
    public void Method2(){
        System.out.println("Method2");
    }
}

class Child3{
    public void Method3(){
        System.out.println("Method3");
    }
}

class Facade{
    Child1 child1 = new Child1();
    Child2 child2 = new Child2();
    Child3 child3 = new Child3();
    public void Run(){
        child1.Method1();
        child2.Method2();
        child3.Method3();
    }
}