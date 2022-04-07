package oop.Animals;

public abstract class Animal {
    private String name;
    int age;

    public Animal(){
        System.out.println("Konstruktor zwierzęcia");
    }

    //Stwórz konstruktor z parametrem przekaż w nim nazwę zwierzęcia i ustaw ją

    public abstract void useVoice();
//    Metoda abstrakcyjna. Klasa MUSI zadeklarować implementację tej metody lub również zostać oznaczona jako abstrakcyjna

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "Zwierzę | nazwa=" + this.name;
    }

    public void printInfo(){
        System.out.println("Cześć nazywam się: " + this.name + "\nMój głos:");
        useVoice();
    }

    public abstract void move();

    //stwórz abstrakcyjną metodę 'move' opisującą ruch zwierzęcia
}
