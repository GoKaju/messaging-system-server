package co.edu.poli.messaging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.poli.messaging.entities.Contact;

@Transactional
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
