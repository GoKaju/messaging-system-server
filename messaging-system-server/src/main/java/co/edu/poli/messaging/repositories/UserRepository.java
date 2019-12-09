package co.edu.poli.messaging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.poli.messaging.entities.User;

@Transactional
public interface UserRepository extends JpaRepository<User, String> {

}
