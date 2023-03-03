package com.alex.springboot.alex.bean;



public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
   private MyOperation myOperation;
public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero=1;
        System.out.println(myOperation.suma(numero));
        System.out.println("Hola desde la implementacion d eun bean con dependencia");
    }
}
