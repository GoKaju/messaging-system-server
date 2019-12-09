package co.edu.poli.messaging.configuration.projections;

import org.springframework.data.rest.core.config.Projection;

import co.edu.poli.messaging.entities.Contact;
import co.edu.poli.messaging.entities.User;

@Projection(name = "contactData", types=Contact.class)
public interface ContactProjection {
    Long getId();
    User getContact();
}
