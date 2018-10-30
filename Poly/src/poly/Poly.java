/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.util.ArrayList;
/**
 *
 * @author rs0865121
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lion lion = new Lion(6, "beige");
        Fish fish = new Fish(2, "golden");
        Dog dog = new Dog(7, "black");
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        aryAnimal.add(lion);
        aryAnimal.add(fish);
        aryAnimal.add(dog);
        
        for (int i = 0; i < aryAnimal.size(); i++)
        {
            allSpeak(aryAnimal.get(i));
        }
    }
    
    
    
    public static void allSpeak(Animal animal)
    {
        animal.display();
        animal.speak();
    }
}
