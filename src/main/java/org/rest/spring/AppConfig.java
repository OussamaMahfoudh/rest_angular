package org.rest.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by oussama on 4/6/2015.
 */

@Configuration
@ComponentScan(basePackages = "org.rest")
//@PropertySource({"classpath:rest.properties", "classpath:web.properties"})
public class AppConfig {

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
