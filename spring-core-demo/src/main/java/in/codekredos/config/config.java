package in.codekredos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import in.codekredos.services.GreetingServices;

@Configuration
@ComponentScan(basePackages = "in.codekredos")
public class config {
    
    @Bean
    public GreetingServices getGreeting()
    {
        return new GreetingServices("HI this is arya");
    }
}
