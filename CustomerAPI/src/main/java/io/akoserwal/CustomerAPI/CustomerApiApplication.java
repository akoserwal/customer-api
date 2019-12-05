package io.akoserwal.CustomerAPI;

import io.akoserwal.CustomerAPI.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CustomerApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApplication.class, args);
	}

}
