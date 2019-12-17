package co.edu.poli.messaging.domains;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserDomainTest {

	@Test
	public void testIsAgeValid() {
		UserDomain domain = new UserDomain();
		boolean isAgeValid = domain.isAgeValid(16);
		Assert.assertTrue(isAgeValid);
	}

}
