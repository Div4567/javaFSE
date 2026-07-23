package com.rest.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        displayCountry();
    }

    public static void displayCountry() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        
        Country country = context.getBean("country", Country.class);
        
        
        LOGGER.debug("Country : {}", country.toString());
	}

}
