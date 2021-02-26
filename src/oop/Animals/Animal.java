package oop.Animals;

public abstract class Animal {
    private String name;

    public Animal(){
        System.out.println("Konstruktor zwierzęcia");
    }

    //Stwórz konstruktor z parametrem przekaż w nim nazwę zwierzęcia i ustaw ją

    public abstract void useVoice();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Zwierzę | nazwa=" + name;
    }

    public void printInfo(){
        System.out.println("Cześć nazywam się " + name + "\nMój głos:");
        useVoice();
    }

    //stwórz abstrakcyjną metodę 'move' opisującą ruch zwierzęcia
}
