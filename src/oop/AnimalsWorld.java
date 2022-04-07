package oop;

import oop.Animals.Animal;
import oop.Animals.Cat;
import oop.Animals.Dog;

public class AnimalsWorld {
    public static void main(String[] args) {
        /*
            PRZED URUCHOMIENIEM KLASY ZAIMPLEMENTUJ KONSTRUKTORY Z PARAMETREM!!
         */

        Animal[] animals = new Animal[5];
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("aaqa");
//        cats[1] = new Dog("bbbb");
//        nie możemy przypisać do obiektu typu Cat przypisać obiektu typu Pies to dwa zupełnie inne obiekty
//        natomiast obydwa te typy są zwięrzętami i wywodzą się z Animal, dlatego do takiego typu możemy je przypisać
        animals[0] = new Dog("Azor");
        animals[1] = new Dog("Szarik");
        animals[2] = new Cat("Mruczek");
        animals[3] = new Dog("Scooby");
        animals[4] = new Cat("Garfield");

        animals[3].printInfo();
//        animals[3].
//        pod indexem 3 znajduje się pies, jednak ponieważ jest on przechowywany w tablicy "pudełku" typu Animal, nie
//        możemy skorzystać z metod dla Dog specyficznych jak np. attackPostman. Możliwe jest jedynie wykorzystanie
//        metod zadeklarowanych w klasie Animal
        Object[] objects = new Object[5];
        objects[0] = new Dog("obiektowy");
        objects[0].toString();
//        Wszystko w javie jest obiektem (Object), dlatego dowolny obiekt możemy przypisać do zmiennej typu Object
//        ale będziemy ograniczeni jedynie do metod deklarowanych w Object
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("ccc");
        dogs[0].attackPostman();

        Animal animal = new Dog("animalowy");


//        Animal animal = new Animal();
//        Niemożliwe jest stworzenie instancji obiektu klasy abstrakcyjnej - new Animal()
        Cat cat1 = new Cat();
//        cat1.printInfo();
        cat1.setName("Mruczek");
        cat1.printInfo();
        System.out.println(cat1.getName());
        System.out.println(cat1);
        cat1.move();

        System.out.println("#### PIES");
        Dog dog1 = new Dog();
        dog1.attackPostman();
        dog1.printInfo();
        System.out.println(dog1);
        dog1.move();
    }
}
