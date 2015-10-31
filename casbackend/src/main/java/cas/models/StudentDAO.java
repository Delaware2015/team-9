package cas.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by emaron on 10/30/15.
 * Student direct access object
 */
public interface StudentDAO extends CrudRepository<Student, Long> {
     String findByEmail(String email);
}
