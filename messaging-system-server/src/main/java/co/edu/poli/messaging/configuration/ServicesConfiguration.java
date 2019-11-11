package co.edu.poli.messaging.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;

import co.edu.poli.messaging.entities.User;


@Configuration
public class ServicesConfiguration implements RepositoryRestConfigurer {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(User.class);
		config.setDefaultMediaType(MediaType.APPLICATION_JSON_UTF8);
        config.useHalAsDefaultJsonMediaType(false);
	}
	
}
