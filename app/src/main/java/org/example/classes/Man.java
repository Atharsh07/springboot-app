package org.example.classes;

public class Man implements Persons {

    private String name;
    private String age;
    private String city;
    private String country;


    public Man(String name, String age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    public String getCountry(){
        return country;
    }

    @Override
    public void introduce(String name) {
        System.out.println("My name is " + this.name);
    }

    @Override
    public void sayAge(String age) {
        System.out.println("My age is " + this.age);
    }

    @Override
    public void saywhereFrom(String city, String country) {
        System.out.println("I am from " + this.city + "and my country is "  + this.country);
    }
}
