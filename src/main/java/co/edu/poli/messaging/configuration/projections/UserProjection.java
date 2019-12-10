package co.edu.poli.messaging.configuration.projections;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import co.edu.poli.messaging.entities.Contact;
import co.edu.poli.messaging.entities.User;

@Projection(name = "inlineData", types=User.class)
public interface UserProjection {
String getUsername();
    List<Contact> getContacts();
}
