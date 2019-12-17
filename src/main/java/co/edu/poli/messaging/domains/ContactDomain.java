package co.edu.poli.messaging.domains;

import co.edu.poli.messaging.entities.Contact;
import co.edu.poli.messaging.entities.User;

public class ContactDomain {
	
	public boolean isContactValid(Contact contact, User userSesion) {
		return userSesion.getContacts().contains(contact);
	}

}
