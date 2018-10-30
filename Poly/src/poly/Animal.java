/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author rs0865121
 */
public abstract class Animal {
    int age;
    String color;
    
    public Animal(int age, String color)
    {
        this.age = age;
        this.color = color;
//        display();
//        speak();
    }
    
    public void display()
    {
        System.out.printf("I am %d and my color is %s\n", age, color);
    }
    
    public abstract void speak();
    
}
