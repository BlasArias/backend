package cl.ucn.disc.dsm.pictwin.backend.dao;

import cl.ucn.disc.dsm.pictwin.backend.model.Twin;
import cl.ucn.disc.dsm.pictwin.backend.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The Repository of Twin
 */
@Repository
public interface TwinRepository extends ListCrudRepository <Twin, Long> {

}
