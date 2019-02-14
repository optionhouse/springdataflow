package com.selflearning.springclouddataflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@AutoConfigurationPackage
@Configuration
@EnableBinding(SourceApplication.class)
public class SourceApplication {

    @Configuration
    public static class ConsumerConfiguration{


        public static void main(){
            ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SourceApplication.class);

            configurableApplicationContext.close();
        }
        @Bean
        public static PropertySourcesPlaceholderConfigurer properties () {
            PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();

            return propertySourcesPlaceholderConfigurer;
        }
    }
}
