import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.ListView;

abstract class Composite{
    protected String name;
    protected int depth = 1;
    Composite(String name){
        this.name = name;
    }
    public abstract void Add(Composite composite);
    public abstract void Remove(Composite composite);
    public abstract void Display();
}

class Leaf extends Composite{
    Leaf(String name){
        super(name);
    }
    public void Add(Composite composite){
        System.out.println("Can't Add");
    }
    public void Remove(Composite composite){
        System.out.println("Can't Remove");
    };
    public void Display(){
        System.out.println("Leaf Display " + depth + " " + this.name);
    };
}

class ConcreteComposite extends Composite{
    private List<Composite> children = new ArrayList<Composite>();
    ConcreteComposite(String name){
        super(name);
    }
    ConcreteComposite(String name, int depth){
        super(name);
        this.depth = depth;
    }
    public void Add(Composite composite){
        composite.depth+=this.depth;
        children.add(composite);
    }
    public void Remove(Composite composite){
        children.remove(composite);
    };
    public void Display(){
        System.out.println("ConcreteComposite Display "+ depth + " " + this.name);
        for (Composite child : children) {
            child.Display();
        }
    };
}