package co.edu.poli.messaging.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import co.edu.poli.messaging.configuration.projections.ContactProjection;
import co.edu.poli.messaging.entities.Contact;

@Transactional
@RepositoryRestResource(path = "contact", excerptProjection = ContactProjection.class)
public interface ContactService extends CrudRepository<Contact, Integer> {


}
