package com.a2vplayer.a2vplayer;

import com.cotrollers.PlayerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan(basePackageClasses=PlayerController.class)
public class A2vplayerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(A2vplayerApplication.class, args);
	}

	@Bean
	public ViewResolver viewResolver() {
		final InternalResourceViewResolver r = new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/jsp/");
		r.setSuffix(".jsp");
		return r;
	}


}

