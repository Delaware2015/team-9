package cas.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by emaron on 10/31/15.
 */
public interface UniversityDAO extends CrudRepository<University, Integer>{
    String findByName(String name);
}
