public class petShop {
    public static void main(String[] args) {
        Animal a1 = new Animal("喵喵");
        a1.speak();
        Dog a2 = new Dog("旺财", "dog");
        a2.speak();
        Animal a3 = new Dog("多多", "dog");
        a2.speak("sad");
        a3.speak();
    }
}

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(this.name + " makes a sound");
    }

    public String getName() {
        return this.name;
    }
}

class Dog extends Animal {
    private String breed;
    String mood;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " barks, it is a " + this.breed);
    }

    public void speak(String mood) {
        System.out.println(getName() + " barks " + mood);
    }

}


