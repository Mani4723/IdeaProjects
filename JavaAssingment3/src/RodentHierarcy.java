/**
 * Created by zemosozemoso on 30/6/17.
 */
abstract class Rodent {
    Rodent() {
        System.out.println("Inside Rodent Constructor");
    }
    abstract void eat(); // abstract class.
    void Sciname() {System.out.println("Scientific name");}
    abstract void habitat();
    abstract void lifespan ();
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse Constructor");
    }
    void eat() {
        System.out.println("Mouse are largely herbivores, they consume any kind of fruit or grain from plants");
    }
    void Sciname() {
        System.out.println("Scientific name of Mouse is Mus");
    }
    void habitat() {
        System.out.println("Mouse is found in many parts of the world.");
    }
    void lifespan () {
        System.out.println("Life span of mouse is 2 years.");
    }

}

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Gerbil Constructor");
    }
    void eat() {
        System.out.println("Gerbils naturally eat seeds of various grasses, bulbs and a range of leaves and herbs.");
    }
    void Sciname() {
        System.out.println("Scientific name of Gerbil is Gerbillinae.");
    }
    void habitat() {
        System.out.println("Gerbil is found in parts of Asia and Africa.");
    }
    void lifespan () {
        System.out.println("Life span of Gerbil is 2-4 years.");
    }

}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("Hamster Constructor");
    }
    void eat() {
        System.out.println("Hamster mainly eats carrots, it also feeds on other vegetables and fruits.");
    }
    void Sciname() {
        System.out.println("Scientific name of Hamster is Cricetinae");
    }
    void habitat() {
        System.out.println("Hamsters were discovered in Syria, though they also live in Greece, Romania, Belgium and northern China.");
    }
    void lifespan () {
        System.out.println("Life span of Gerbil is 3 years.");
    }
}

public class RodentHierarcy {
    public static void main (String[] args) {
        Rodent rodents [] = new Rodent[3]; // create an array of rodents.
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        // calling the methods of each type.
        for (int i = 0; i < rodents.length; i++)
        {
           rodents[i].eat();
           rodents[i].habitat();
           rodents[i].lifespan();
           rodents[i].Sciname();
        }

      }

}
