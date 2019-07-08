interface Operation {
    double num1 = 9;
    double num2 = 3;

    double getInstance();
}

class AddOperation implements Operation {
    public double getInstance() {
        return num1 + num2;
    }
}

class SubtractOperation implements Operation {
    public double getInstance() {
        return num1 - num2;
    }
}

public class Factory {
    public static Operation CreateOperation(int operation) {
        Operation oper = null;
        switch (operation) {
        case 1:
            oper = new AddOperation();
            break;
        default:
            oper = new SubtractOperation();
        }
        return oper;
    }
}