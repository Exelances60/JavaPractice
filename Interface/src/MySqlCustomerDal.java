public class MySqlCustomerDal implements ICustomerDal {

    @Override
    public void add(String name) {
        System.out.println("MySql eklendi.");
        System.out.println("Name: " + name);
    }

    @Override
    public void delete() {

    }
}
