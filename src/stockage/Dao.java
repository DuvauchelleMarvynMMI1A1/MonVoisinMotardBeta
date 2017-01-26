package stockage;

import java.util.List;

public interface Dao<T> {
    T find(int id);
    List<T> findAll();
    void modifier(T obj);
    void supprimer(T obj);
    void inserer(T obj);
}