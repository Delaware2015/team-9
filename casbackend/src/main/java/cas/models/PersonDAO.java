package cas.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by emaron on 10/30/15.
 */
public interface PersonDAO extends CrudRepository<Person, Long> {
    String findByEmail(String email);

}
