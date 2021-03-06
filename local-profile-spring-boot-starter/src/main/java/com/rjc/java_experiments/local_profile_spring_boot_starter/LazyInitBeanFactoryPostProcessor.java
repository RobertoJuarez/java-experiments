package com.rjc.java_experiments.local_profile_spring_boot_starter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**
 * Marks all the beans as lazy.
 *
 * @author rjc.
 */
public class LazyInitBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory( ConfigurableListableBeanFactory configurableListableBeanFactory ) throws BeansException {

        for( String beanName : configurableListableBeanFactory.getBeanDefinitionNames() ) {

            BeanDefinition definition = configurableListableBeanFactory.getBeanDefinition(beanName);

            definition.setLazyInit( true );
        }
    }

}
