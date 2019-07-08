public class SubtractFactory implements Factory{
    public Operation CreatOperation(){
        return new SubtractOperation();
    }
}