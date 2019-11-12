package co.edu.poli.messaging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.messaging.entities.User;
import co.edu.poli.messaging.repositories.UserRepository;

@Transactional
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<Object> getUsers() {
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> signUp(@RequestBody User user) {
		User userSaved = userRepository.save(user);
		return new ResponseEntity<>(userSaved, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Object> retrieveStudent(@PathVariable String id) {
		return new ResponseEntity<Object>(userRepository.findById(id), HttpStatus.OK);
	}
	
}
