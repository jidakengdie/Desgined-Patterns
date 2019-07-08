public class MultiplyFactory implements Factory{
    public Operation CreatOperation(){
        return new MultiplyOperation();
    }
}