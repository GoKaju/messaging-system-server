package co.edu.poli.messaging.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import co.edu.poli.messaging.configuration.projections.UserProjection;
import co.edu.poli.messaging.entities.User;

@Transactional
@RepositoryRestResource(path = "user", excerptProjection = UserProjection.class)
public interface UserService extends CrudRepository<User, String>{

}
