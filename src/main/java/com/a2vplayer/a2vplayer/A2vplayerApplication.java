package com.a2vplayer.a2vplayer;

import com.cotrollers.PlayerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=PlayerController.class)
public class A2vplayerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(A2vplayerApplication.class, args);
	}


}

