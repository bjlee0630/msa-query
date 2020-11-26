package msaquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableEurekaClient
@SpringBootApplication
public class MsaQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaQueryApplication.class, args);
	}

}
