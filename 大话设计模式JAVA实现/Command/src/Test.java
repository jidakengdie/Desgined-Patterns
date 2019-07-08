public class Test {
    public static void main(String[] args) {
        // 烤串师傅初始化
        mReceiver receiver = new mReceiver();
        // 命令初始化
        Command command = new Command1(receiver);
        // 服务员初始化
        Invoke invoke = new Invoke();
        // 命令告知服务员
        invoke.SetCommand(command);
        invoke.Execute();
    }
}