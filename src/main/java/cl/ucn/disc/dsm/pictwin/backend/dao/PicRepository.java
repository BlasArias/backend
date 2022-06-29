package cl.ucn.disc.dsm.pictwin.backend.dao;

import cl.ucn.disc.dsm.pictwin.backend.model.Pic;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

/**
 * The Repository
 */
@Repository
public interface PicRepository extends ListCrudRepository<Pic, Long> {
}
