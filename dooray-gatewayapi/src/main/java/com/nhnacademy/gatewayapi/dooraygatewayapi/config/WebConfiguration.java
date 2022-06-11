package com.nhnacademy.gatewayapi.dooraygatewayapi.config;

import java.time.Duration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfiguration {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
            .setReadTimeout(Duration.ofSeconds(5L))
            .setConnectTimeout(Duration.ofSeconds(3L))
            .build();
    }
}