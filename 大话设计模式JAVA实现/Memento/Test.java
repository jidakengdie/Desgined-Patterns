class Originator {
    private String name;
    private String age;
    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }
    public Memento CreateMemento() {
        return new Memento(this.name, this.age);
    }
    public void SetMemento(Memento memento){
        age = memento.getAge();
        name = memento.getName();
    }
    public void Show() {
        System.out.println("name: " + this.name + ", age: " + this.age);
    }
}

class Memento {
    private String name;
    private String age;
    Memento(String name, String age){
        this.name = name;
        this.age = age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }
}

class CareTaker {
    private Memento memento;
    /**
     * @return the memento
     */
    public Memento getMemento() {
        return memento;
    }
    /**
     * @param memento the memento to set
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

public class Test {
    public static void main(String[] args) {
        Originator o1 = new Originator();
        o1.setName("Luo");
        o1.setAge("23");
        o1.Show();

        CareTaker c1 = new CareTaker();
        c1.setMemento(o1.CreateMemento());

        o1.setName("Zhang");
        o1.setAge("18");
        o1.Show();

        o1.SetMemento(c1.getMemento());
        o1.Show();
    }
}