package com.express.aliExpress_commande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.express.aliExpress_commande.rest")
public class AliExpressCommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliExpressCommandeApplication.class, args);
	}

}

