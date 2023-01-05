package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher1;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher1, Long> {
}
