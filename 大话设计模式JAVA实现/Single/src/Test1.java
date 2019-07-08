class Singleton {
    private int number = 0;
    private static Singleton instance;

    private Singleton() {
        number++;
        System.out.println("number is " + number);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}