package com.rjc.java_experiments.local_profile_spring_boot_starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * This configuration sets to lazy the initialization of scanned components.
 *
 * @author rjc.
 */
@Configuration
@Profile( "local" )
public class LocalProfileConfiguration {


    @Bean
    public static LazyInitBeanFactoryPostProcessor lazyInitBeanFactoryPostProcessor() {

        return new LazyInitBeanFactoryPostProcessor();
    }
}
