package generics;

import java.util.List;
import java.util.Objects;

public interface GenericRepository<T> {

    T findOne(Object id);
    T findByName(Object name);
    boolean ifExists(Objects id);
    List<T> searchAll();
    T update(T item);
    boolean delete(Object id);
}
