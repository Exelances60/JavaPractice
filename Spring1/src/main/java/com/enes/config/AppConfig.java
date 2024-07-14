package com.enes.config;

import com.enes.Alien;
import com.enes.Computer;
import com.enes.Desktop;
import com.enes.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.enes")
public class AppConfig {
    // This is the configuration class
    // @Bean(name = "computer")
/*    @Bean
    // @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Laptop laptop() {
        return new Laptop();
    }

    @Bean
    public Alien alien(@Autowired @Qualifier("laptop") Computer computer) {
        Alien alien = new Alien();
        alien.setAge(10);
        alien.setComputer(computer);
        return alien;
    }*/


}
