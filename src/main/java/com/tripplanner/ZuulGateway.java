package com.tripplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@PropertySource(value={"classpath:auth.properties"})
public class ZuulGateway {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateway.class, args);
	}
}