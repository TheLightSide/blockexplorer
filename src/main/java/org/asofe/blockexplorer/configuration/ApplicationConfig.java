package org.asofe.blockexplorer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
public class ApplicationConfig {

    @Resource
    private Environment environment;
}
