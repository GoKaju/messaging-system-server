package co.edu.poli.messaging.domains;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import co.edu.poli.messaging.entities.Contact;
import co.edu.poli.messaging.entities.User;

public class ContactDomainTest {

	@Test
	public void testIsContactValid() {
		//arrange
		User user = new User();
		List<Contact> contacts = new ArrayList<Contact>();
		Contact pollito = new Contact();
		pollito.setId(1);
		contacts.add(pollito);
		user.setContacts(contacts);
		//act
		ContactDomain domain = new ContactDomain();
		boolean isValidContact = domain.isContactValid(pollito, user);
		//assert
		Assert.assertTrue(isValidContact);
	}

}
