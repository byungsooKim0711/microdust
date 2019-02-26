package org.kimbs.microdust;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.kimbs" })
@MapperScan(basePackages = { "org.kimbs" })
public class MicrodustApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrodustApplication.class, args);
	}

}
