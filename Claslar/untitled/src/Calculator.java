public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    public void addition(int... a) {
        int total = 0;
        for (int i : a) {
            total += i;
        }
        System.out.println("Result: " + total);
    }

    public void subtraction(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    public void subtraction(int... a) {
        int total = a[0];
        for (int i = 1; i < a.length; i++) {
            total -= a[i];
        }
        System.out.println("Result: " + total);
    }

    public void multiplication(int a, int b) {
        System.out.println("Result: " + (a * b));
    }

    public void multiplication(int... a) {
        int total = 1;
        for (int i : a) {
            total *= i;
        }
        System.out.println("Result: " + total);
    }

    public void division(int a, int b) {
        System.out.println("Result: " + (a / b));
    }

    public void division(int... a) {
        int total = a[0];
        for (int i = 1; i < a.length; i++) {
            total /= a[i];
        }
        System.out.println("Result: " + total);
    }

}
