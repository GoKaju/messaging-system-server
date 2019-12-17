package co.edu.poli.messaging.domains;

public class UserDomain {
	
	private int minAge = 15;
	
	public boolean isAgeValid(int age) {
		return age > minAge;
	}
	
	

}
