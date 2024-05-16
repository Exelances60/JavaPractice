public class Customer implements IEntity {
    int id;
    String firstName;
    String lastName;
    String email;
    String password;
    public Customer(int id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
