public class transportSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Mercedes");
        v1.speak();
        Bus v2 = new Bus("Scania",110);
        v2.speak();
        v2.speak("Delayed");
        Vehicle v3 = new Bus("Man",130);
    }
}

class Vehicle {
    private String model;
    Vehicle(String model) {
        this.model = model;
    }
    public void speak(){
        System.out.println(this.model+" is moving forward");
    }

    String getModel() {
        return this.model;
    }
}

class Bus extends Vehicle {
    private int capacity;
    Bus(String model, int capacity) {
        super(model);
        this.capacity = capacity;
    }
    @Override
    public void speak(){
        System.out.println(getModel()+" is a bus with "+this.capacity+" seats");
    }

    public void speak(String status){
        System.out.println(getModel()+" is a bus and it is "+status);
    }
}
