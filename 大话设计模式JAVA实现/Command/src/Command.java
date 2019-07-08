abstract class Command{
    public mReceiver receiver = null;
    Command(mReceiver receiver){
        this.receiver = receiver;
    }
    public abstract void Execute();
}

class Command1 extends Command{
    Command1(mReceiver receiver){
        super(receiver);
    }
    public void Execute(){
        receiver.Action();
    }
}

// 最后执行者，相当于烤串师傅
class mReceiver{
    public void Action(){
        System.out.println("begin executing");
    }
}

// 客户说的命令触发,相当于服务员
class Invoke{
    private Command command;
    public void SetCommand(Command command){
        this.command = command;
    }
    public void Execute(){
        command.Execute();
    }
}