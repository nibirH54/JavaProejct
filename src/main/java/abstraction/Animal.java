package abstraction;

abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzz");

    }
    //Animal myObj = new Animal();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: Wee wee");
    }
}

class Main{
    public static void main(String[] args) {

        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
