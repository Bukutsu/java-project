package item;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DAO <T>{

    Optional<T> findByID(long id);

    List<T> findALL();

    void save(T t) throws IOException;

    void update(T t,String[] params);

    void delete(T t);
    
}
