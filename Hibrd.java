class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

interface  Pet{
    void paly();
}

interface  Guard{
    void protect();
}

class DogService extends Dog implements Pet, Guard{
    public void paly(){
        System.out.println("playing...");
    }
    public void protect(){
        System.out.println("protecting...");
    }
}


public class Hibrd {
    public static void main(String[] args) {
        DogService ds = new DogService();
        ds.eat();
        ds.bark();
        ds.paly();
        ds.protect();
    }
    
}
