package com.example.test_featuresprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Map;

@SpringBootApplication
public class TestFeaturesProfileApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(TestFeaturesProfileApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();

        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();

        MutablePropertySources propertySources = environment.getPropertySources();

        System.out.println(systemEnvironment);
        System.out.println(propertySources);
    }

}
