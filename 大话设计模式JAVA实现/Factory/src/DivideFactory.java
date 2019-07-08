public class DivideFactory implements Factory{
    public Operation CreatOperation(){
        return new DivideOperation();
    }
}