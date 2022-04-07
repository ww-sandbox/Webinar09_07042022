package oop.Animals;

public class Dog extends Animal {
    @Override
    public void useVoice() {
        System.out.println("Woof Woof");
    }
    //    Implementacja abstrakcyjnej metody klasy Animal

    public Dog(){}
//    Dopóki nie zadeklarowaliśmy implementacji innych konstruktorów, nie ma konieczności deklarowania konstruktora
//    domyślnego. Jednak jeśli pojawia się inny, musimy taką deklarację stworzyć. W innym przypadku nie będziemy
//    w stanie stworzyć obiektu danej klasy bez przekazania parametrów np. Dog()

    public Dog(String name){
        System.out.println("Konstruktor psa z parametrem");
        this.setName(name);
    }

    @Override
    public void move() {
        System.out.println("Chodzę na spacery z właścicielem");
    }
//    Implementacja abstrakcyjnej metody klasy Animal
    //zaimplementuj klasę 'Dog' podobną do klasy 'Cat'
    public void attackPostman(){
        System.out.println("Przyszedł listonosz więc go zaatakuję");
    }
}
