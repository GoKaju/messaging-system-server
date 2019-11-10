package co.edu.poli.messaging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.messaging.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
