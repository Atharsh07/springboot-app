package org.example;

import org.example.classes.Man;
import org.example.classes.PersonIncovationHandler;
import org.example.classes.Persons;
import java.lang.reflect.Proxy;


public class App {

    public static void main(String[] args) {
        Man mohan = new Man("atharsh", "30", "chennai", "india");
        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
        Class[] interfaces = mohan.getClass().getInterfaces();
        Persons proxyMohan = (Persons) Proxy.newProxyInstance(
                mohanClassLoader,
                interfaces,
                new PersonIncovationHandler(mohan)
        );
        proxyMohan.introduce(mohan.getName());
        proxyMohan.sayAge(mohan.getAge());
        proxyMohan.saywhereFrom(mohan.getCity() , mohan.getCountry());
    }

}
