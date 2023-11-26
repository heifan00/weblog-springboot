package net.heifan.weblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"net.heifan.weblog.*"})
public class WebApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(WebApplication.class, args);
    }
}
