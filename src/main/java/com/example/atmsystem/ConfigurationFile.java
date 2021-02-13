package com.example.atmsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.atmsystem")
@PropertySource("application.properties")
public class ConfigurationFile {

}
