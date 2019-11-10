package co.edu.poli.messaging.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.edu.poli.messaging.entities.User;

@RepositoryRestResource(path = "user")
public interface UserService extends CrudRepository<User, String>{

}
