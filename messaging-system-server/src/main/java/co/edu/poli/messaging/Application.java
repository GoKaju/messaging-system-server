package co.edu.poli.messaging;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.edu.poli.messaging.entities.Contact;
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
			repository.save(new User("pollito", "Administrador", "123"));
			repository.save(new User("ganzo", "Administrador", "123"));
			repository.save(new User("conejo", "Administrador", "123"));
			repository.save(new User("lechuga", "Administrador", "123"));
			repository.save(new User("gorila", "Administrador", "123"));

			User usuarioConsultado = repository.findById("adminPoligran").get();
			User usuarioContacto = repository.findById("pollito").get();
			User ganzo = repository.findById("ganzo").get();
			User conejo = repository.findById("conejo").get();
			User lechuga = repository.findById("lechuga").get();
			User gorila = repository.findById("gorila").get();
			

			List<Contact> contacts = new ArrayList<>();

			contacts.add(new Contact(usuarioConsultado, usuarioContacto));
			contacts.add(new Contact(usuarioConsultado, ganzo));
			contacts.add(new Contact(usuarioConsultado, conejo));
			contacts.add(new Contact(usuarioConsultado, lechuga));
			contacts.add(new Contact(usuarioConsultado, gorila));
			
			usuarioConsultado.setContacts(contacts);
			repository.save(usuarioConsultado);
		};
	}
}
