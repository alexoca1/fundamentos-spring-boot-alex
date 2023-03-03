package com.alex.springboot.alex.bean;

import org.springframework.context.annotation.Bean;

public class MyBean2Implement implements MyBean{
    @Override
    public void print() {
        System.out.println("hola desde mi implemntacion 2 propia del bean 2");

    }
}
