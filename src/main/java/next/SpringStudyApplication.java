package next;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import next.domain.User;
import next.repository.BoardRepository;
import next.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
@EnableOAuth2Client
public class SpringStudyApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringStudyApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringStudyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository userRepository, BoardRepository repository) {
		return (args) -> {
			// save a couple of customers
			
			
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));

			
		};
	}
}
