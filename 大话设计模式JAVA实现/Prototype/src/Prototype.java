abstract class Prototype{
    protected String opt;
    public abstract Prototype copy();
}

class Text extends Prototype{
    Text(String opt){
        this.opt = opt;
    }
    public Prototype copy(){
        return new Text(this.opt);
    }
}