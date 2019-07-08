interface Software{
    void Operation();
}

class Game implements Software{
    public void Operation(){
        System.out.println("Game working");
    }
}

class Telephone implements Software{
    public void Operation(){
        System.out.println("Telephone working");
    }
}

interface Brand{
    void SetSoftware(Software software);
    void BrandOperation();
}

class Brand1 implements Brand{
    Software software;
    public void SetSoftware(Software software){
        this.software = software;
    }
    public void BrandOperation(){
        System.out.println("Brand1 working");
        software.Operation();
    }
}

class Brand2 implements Brand{
    Software software;
    public void SetSoftware(Software software){
        this.software = software;
    }
    public void BrandOperation(){
        System.out.println("Brand2 working");
        software.Operation();
    }
}

public class Test{
    public static void main(String[] args) {
        Brand brand1 = new Brand1();
        brand1.SetSoftware(new Telephone());
        brand1.BrandOperation();
        brand1.SetSoftware(new Game());
        brand1.BrandOperation();

        Brand brand2 = new Brand2();
        brand2.SetSoftware(new Telephone());
        brand2.BrandOperation();
        brand2.SetSoftware(new Game());
        brand2.BrandOperation();
    }
}