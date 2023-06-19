package generics;

import java.util.List;
import java.util.Objects;

public class ConcreteRepository implements GenericRepository<String>{
    @Override
    public String findOne(Object id) {
        return null;
    }

    @Override
    public String findByName(Object name) {
        return null;
    }

    @Override
    public boolean ifExists(Objects id) {
        return false;
    }

    @Override
    public List<String> searchAll() {
        return null;
    }

    @Override
    public String update(String item) {
        return null;
    }

    @Override
    public boolean delete(Object id) {
        return false;
    }
}
