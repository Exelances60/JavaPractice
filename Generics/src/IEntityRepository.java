public interface IEntityRepository<T extends IEntity> {
    void add(T entity);
    void remove(T entity);
    T get(int id);
    void update(T entity);
}
