package com.alex.springboot.alex.bean;



public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("hola desde mi implemntacion propia del bean");

    }
}
