package com.rjc.java_experiments.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * Configuration for the local profile. It makes lazy the initialization of beans.
 *
 */
@Configuration
@ComponentScan( lazyInit = true )
@Profile( "local" )
public @interface LocalProfileConfiguration {
}
