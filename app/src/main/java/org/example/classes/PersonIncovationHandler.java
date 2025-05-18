package org.example.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonIncovationHandler implements InvocationHandler {

    private Persons persons;

    public PersonIncovationHandler(Persons person){
        this.persons = person;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Hi");
        return null;
    }
}
