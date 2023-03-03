package com.alex.springboot.alex.configuration;

import com.alex.springboot.alex.bean.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {

        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation() {

        return  new MyOperationImplement();
    }
    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation) {

        return new MyBeanWithDependencyImplement(myOperation);
    }

}
