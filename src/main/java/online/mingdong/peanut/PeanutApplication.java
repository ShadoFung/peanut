package online.mingdong.peanut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Shado
 */
@SpringBootApplication(scanBasePackages = {"online.mingdong.peanut"})
public class PeanutApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeanutApplication.class, args);
	}

}

