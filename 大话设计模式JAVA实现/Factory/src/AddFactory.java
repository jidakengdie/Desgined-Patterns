public class AddFactory implements Factory{
    public Operation CreatOperation(){
        return new AddOperation();
    }
}