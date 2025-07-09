class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog: " + breed);
    }
}

public class AnimalsandDogs {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", "柴犬");
    }
}
