package co.edu.poli.messaging.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.messaging.entities.User;
import co.edu.poli.messaging.repositories.UserRepository;

@Transactional
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody User userLogin) {
		Optional<User> optionalUser = userRepository.findById(userLogin.getUsername());
		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			if(userLogin.getPassword().equals(user.getPassword())) {
				return new ResponseEntity<>(user, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
