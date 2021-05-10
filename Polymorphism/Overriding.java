package com.company.Polymorphism;

class Father {

    public static void marry()
    {
        System.out.println("Marry to Hindu girl");
    }
    public static void property()
    {
        System.out.println("I'm parent of child and have House and Money");
    }
}
class Child extends Father{

    public static void marry() {

        System.out.println("Marry to Muslim girl");
    }

}
public class Overriding{

    public static void main(String[] args)
    {
        Child obj1=new Child();
        Child.property();
        Child.marry();


    }

}