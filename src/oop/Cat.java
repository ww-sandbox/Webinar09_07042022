package oop;

public class Cat extends Animal{
    public Cat(){
        System.out.println("Konstruktor kota");
    }

    //stwórz konstruktor 'Cat' z parametrem wykorzystujący konstruktor klasy bazowej do ustawienia imienia

    @Override
    public void useVoice(){
        System.out.println("Meeeeooowww");
    }

    @Override
    public String toString(){
        return "Kot | nazwa=" + this.getName();
    }

    //zaimplementuj metodę move
}
