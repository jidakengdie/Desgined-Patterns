// 迭代器
interface Iterator{
    public Object First();
    public Object Next();
    public boolean IsDone();
    public Object CurrentItem();
}

// 聚集
interface Aggrevate{
    public Iterator CreateIteraor();
}

class ConcreteIterator implements Iterator{
    private ConcreteAggrevate aggrevate;
    private int current = 0;
    public Object First();
    public Object Next();
    public boolean IsDone();
    public Object CurrentItem();
}

class ConcreteAggrevate implements Aggrevate{

}