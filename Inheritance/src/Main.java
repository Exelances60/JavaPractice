
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.List();
        EmployessManager employessManager=new EmployessManager();
        employessManager.Add();
        employessManager.List();
    }
}