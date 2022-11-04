package product;


import java.util.List;

public interface CustomRepository<T> {
    T findById(int id);
    List<T> findByTitleLike(String title);
    void update(T item);
}
