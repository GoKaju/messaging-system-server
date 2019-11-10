package co.edu.poli.messaging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.messaging.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
