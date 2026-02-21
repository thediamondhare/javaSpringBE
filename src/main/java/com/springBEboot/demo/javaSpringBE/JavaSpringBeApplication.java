package com.springBEboot.demo.javaSpringBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* specific paths to scan
@SpringBootApplication( scanBasePackages = {
			"com.springBEboot.demo.javaSpringBE",
			"com.springBEboot.util",
		})
*/

@SpringBootApplication
public class JavaSpringBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBeApplication.class, args);
	}

}
