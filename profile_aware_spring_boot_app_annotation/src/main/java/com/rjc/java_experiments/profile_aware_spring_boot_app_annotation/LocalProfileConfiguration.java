package com.rjc.java_experiments.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan( lazyInit = true )
@Profile( "local" )
public class LocalProfileConfiguration {
}
