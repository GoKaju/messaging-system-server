package co.edu.poli.messaging;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.edu.poli.messaging.entities.User;
import co.edu.poli.messaging.repositories.UserRepository;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Bean
	public CommandLineRunner loadData(UserRepository repository) {
		return (args) -> {
			repository.save(new User("adminPoligran", "Administrador", "123"));
		};
	}
}
