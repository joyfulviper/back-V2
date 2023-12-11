package com.garden.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Configuration
    static class Config {

        @Bean
        public ShallowEtagHeaderFilter shallowEtagHeaderFilter() {
            return new ShallowEtagHeaderFilter();
        }
    }

    @RestController
    static class Etag {

        @GetMapping("/etag")
        public ResponseEntity<String> etag() {
//            String[] s = {"hello", "hello2"};
//            Random random = new SecureRandom();
//            int n = random.nextInt(2);

            return ResponseEntity.ok("etag");
        }
    }
}