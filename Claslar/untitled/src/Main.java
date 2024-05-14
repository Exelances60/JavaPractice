public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        Calculator calculator = new Calculator();
        calculator.addition(1, 2);
        System.out.println("---------------");
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Black", "123456");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}

