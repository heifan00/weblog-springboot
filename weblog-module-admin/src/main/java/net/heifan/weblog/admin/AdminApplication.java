package net.heifan.weblog.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"net.heifan.weblog.*"})
public class AdminApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(AdminApplication.class, args);
    }
}
