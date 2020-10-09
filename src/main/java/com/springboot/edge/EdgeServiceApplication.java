package com.springboot.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.springboot.filter.SimplePostFilter;
import com.springboot.filter.SimplePreFilter;

@EnableZuulProxy
@SpringBootApplication
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}

	
	  @Bean public SimplePreFilter simplePreFilter() { return new
	  SimplePreFilter(); }
	  
	  @Bean public SimplePostFilter simplePostFilter() { return new
	  SimplePostFilter(); }
	 
}
