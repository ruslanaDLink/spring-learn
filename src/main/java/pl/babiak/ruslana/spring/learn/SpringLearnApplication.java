package pl.babiak.ruslana.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

}
// TODO: 04/12/2023
// stworzyc nowa oddzielna aplikcje spring boot + spring framework za pomoca https://start.spring.io/
// umiescic aplikacke spring-learn na git
// zapoznac sie z artykulem https://geek.justjoin.it/komunikacja-frontend-www-z-backend-w-javie/

// TODO: 18/12/2023
// opcjonalnie, napisac test dla controller https://spring.io/guides/gs/testing-web/
// analogicznie do warstw dla klasy note stworzyc wlasne warstwy dla klasy author
// dla nowych warstw klasy author stworzyc testy jednostkowe
// zapoznac sie z dokumentacja Spring Framework https://docs.spring.io/spring-framework/reference/core.html