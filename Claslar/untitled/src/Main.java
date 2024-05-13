
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        Calculator calculator = new Calculator();
        calculator.addition(1, 2);
        calculator.addition(1, 2, 3);
        calculator.subtraction(10, 2);
        calculator.subtraction(10, 2, 3);
    }
}

