package br.com.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.unit.config.FileStorageConfig;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication 
@EntityScan("br.com.unit.domain")
@EnableSwagger2
@EnableConfigurationProperties({
	FileStorageConfig.class
})
public class ServicosUnit1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServicosUnit1Application.class, args);
	}

}
