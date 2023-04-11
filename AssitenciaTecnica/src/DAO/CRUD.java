package DAO;

public interface CRUD <T, E extends Exception>{
    public T create(T obj);
    public T findById(int id);

    public void update(T obj) throws E;
    public void delete (int id) throws  E;

}
