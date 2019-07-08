public class Test {
    public static void main(String[] args) {
        ConcreteMediate concreteMediate = new ConcreteMediate();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediate);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediate);
        concreteMediate.SetColleague1(concreteColleague1);
        concreteMediate.SetColleague2(concreteColleague2);

        concreteColleague1.Send("你好吗");
        concreteColleague2.Send("不好");
    }
}