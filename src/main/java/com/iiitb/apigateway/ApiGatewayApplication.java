package com.iiitb.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ApiGatewayApplication {

//	@Autowired
//	private List<String> serviceList;

	@Bean
	public RouteLocator DemoRoutes(RouteLocatorBuilder routeLocatorBuilder){

		return routeLocatorBuilder.routes()
				.route(
				p -> p.path("/auth/**")
						.filters(rw -> rw.rewritePath("/auth/(?<segment>.*)","/AUTH-SERVICE/${segment}"))
						.uri("http://localhost:9999/"))
				.route(
						p -> p.path("/demo/**")
								.filters(rw -> rw.rewritePath("/demo/(?<segment>.*)","/DEMO-SERVICE/${segment}"))
								.uri("http://localhost:9999/"))
				.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
