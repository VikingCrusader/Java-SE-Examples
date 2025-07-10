public class Device_Boot_System {
    public static void main(String[] args) {
        Device l1 = new Laptop("Lenovo");
        l1.showBrand();
        Device l2 = new Laptop("Dell");
        l2.powerOn();
        Device l3 = new Laptop("Apple");
        l3.showBrand();
        Device l4 = new Smartphone("Samsung");
        l4.powerOn();
        Device l5 = new Smartphone("Xiaomi");
        l5.showBrand();
        Device l6 = new Smartphone("Huawei");
        l6.powerOn();
    }
}

abstract class Device {
    String brand;
    Device(String brand) {
        this.brand = brand;
    }
    String getBrand() {
        return this.brand;
    }
    void showBrand() {
        System.out.println("Device Brand: "+this.brand);
    }
    abstract void powerOn();
}

class Laptop extends Device {
    Laptop(String brand) {
        super(brand);
    }
    void powerOn() {
        System.out.println(this.brand+" laptop is powered on");
    }
}

class Smartphone extends Device {
    Smartphone(String brand) {
        super(brand);
    }
    void powerOn() {
        System.out.println(this.brand+" smartphone is booting up");
    }
}
