public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        String value = "asdasd";
        try {
            var deger = validator.validate(value);
            System.out.println(deger.getClass().getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}