package cas.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by emaron on 10/30/15.
 */
public interface TaskDAO extends CrudRepository<Task, Long> {
    String findByName(String name);

    Task findOneByName(String name);
}
