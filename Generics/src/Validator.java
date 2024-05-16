public class Validator {
    public <T> T validate(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return value;
    }
}
