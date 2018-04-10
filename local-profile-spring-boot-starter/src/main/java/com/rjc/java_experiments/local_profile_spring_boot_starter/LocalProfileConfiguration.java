package com.rjc.java_experiments.profile_aware_spring_boot_app_annotation;

import org.springframework.context.annotation.*;


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
