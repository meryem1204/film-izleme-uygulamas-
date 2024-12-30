package com.example.gatewayservices;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
//RouteLocatorBuilder rotalari tanimlar
//RouteLocator Uygulama çalışırken tüm rotaların listesini içeren bir nesnedir.
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
       // mikroservislerin giriş noktalarını tanımlamak ve istemciden gelen HTTP isteklerini uygun mikroservislere yönlendirmektir
        return builder.routes()
                .route("film-services", r -> r
                        .path("/api/films/**")
                        .uri("http://film-services:8081"))

                .route("user-services", r -> r
                        .path("/api/users/**")
                        .uri("http://user-services:8082"))
                .build();

    }
}
