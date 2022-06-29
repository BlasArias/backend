package cl.ucn.disc.dsm.pictwin.backend.dao;

import cl.ucn.disc.dsm.pictwin.backend.model.User;
import lombok.NonNull;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * The Repository of User
 */
@Repository
public interface UserRepository extends ListCrudRepository <User, Long> {
    Optional<User> findOneByEmail(@NonNull String email);
}
