package oop.Animals;

public class Cat extends Animal{
    public Cat(){
        System.out.println("Konstruktor kota");
    }

    public Cat(String name){
        System.out.println("Konstruktor kota z parametrem");
        this.setName(name);
    }
    //stwórz konstruktor 'Cat' z parametrem wykorzystujący konstruktor klasy bazowej do ustawienia imienia

    @Override
    public void useVoice(){
        System.out.println("Meeeeooowww");
    }
    //    Implementacja abstrakcyjnej metody klasy Animal

    @Override
    public String toString(){
        return "Kot | nazwa=" + this.getName();
    }

    @Override
    public void printInfo(){
        super.printInfo();
//        System.out.println("Cześć nazywam się: " + this.getName() + "\nMój głos:");
//        useVoice();
        System.out.println("Jestem kotem .....");
    }

    @Override
    public void move() {
        System.out.println("Chodzę własnymi ścieżkami");
    }
    //    Implementacja abstrakcyjnej metody klasy Animal
    //zaimplementuj metodę move
}
