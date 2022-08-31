package com.example.EcommerceMindhub;

import com.example.EcommerceMindhub.repositories.ClientRepository;
import com.example.EcommerceMindhub.repositories.ShoppingCartRepositorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceMindhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMindhubApplication.class, args);
	}



	@Bean
	//Instanciamos el repositorio
	public CommandLineRunner initData(ClientRepository clientRepository,
									  ShoppingCartRepositorie shoppingCartRepositories)  {
		return (args) ->{

		};
	};

}