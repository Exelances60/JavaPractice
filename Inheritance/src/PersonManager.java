public class PersonManager implements IPersonManager {
    @Override
    public void Add() {
        System.out.println("Person added.");
    }

    @Override
    public void List() {
        System.out.println("Person listed.");
    }
}
