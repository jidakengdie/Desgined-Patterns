interface Strategy{
    void AlgorithmInterface();
}

class Strategy1 implements Strategy{
    public void AlgorithmInterface(){
        System.out.println("Strategy1");
    }
}

class Strategy2 implements Strategy{
    public void AlgorithmInterface(){
        System.out.println("Strategy2");
    }
}

class Context{
    Strategy strategy;
    Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}