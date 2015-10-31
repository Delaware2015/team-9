package cas.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by emaron on 10/30/15.
 */
public interface StudentDAO extends CrudRepository<Student, Long> {
}
