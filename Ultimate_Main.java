import java.util.*;
public class Ultimate_Main {
    public static void main(String[] args) {
        //创建若干个设备实例（至少1个 Smartphone、Laptop、Tablet）
        Smartphones s1 = new Smartphones("Apple");
        Smartphones s2 = new Smartphones("Samsung");
        Laptops l1 = new Laptops("Dell");
        Laptops l2 = new Laptops("HP");
        Tablets t1 = new Tablets("Xiaomi");
        Tablets t2 = new Tablets("Apple");

        //创建若干个消息处理器：
        //传统类实现，打印消息
        MessageProcessor1 Print1 = new MessageProcessor1() {
            @Override
            public void process(String message) {
                System.out.println("Message1: " + message);
            }
        };
        //匿名类实现，打印消息长度
        MessageProcessor1 Print2 = (message) -> {
            System.out.println("Message2: " + message);
            System.out.println("The length of message 2 is: " + message.length());
        };
        //Lambda 实现，消息反转打印
        MessageProcessor1 Print3 = (message) -> {
            String reversed = new StringBuffer(message).reverse().toString();
            System.out.println("The reversed version of message 3 is: " + reversed);
        };
        //Lambda 实现，消息加星号高亮打印
        MessageProcessor1 Print4 = (message) -> {
            LinkedList<String> list = new LinkedList<>();
            list.add(message);
            list.addFirst("*****");
            list.addLast("*****");
            String result = String.join(" ", list);
            System.out.println("The highlighted version of message 4 is: " + result);
        };
        //将设备和处理器都添加到 DeviceManager
        DeviceManager manager = new DeviceManager();
        manager.addDevice(s1);
        manager.addDevice(s2);
        manager.addDevice(l1);
        manager.addDevice(l2);
        manager.addDevice(t1);
        manager.addDevice(t2);
        manager.addProcessor(Print1);
        manager.addProcessor(Print2);
        manager.addProcessor(Print3);
        manager.addProcessor(Print4);
        //调用 powerOnAllDevices()
        manager.powerOnAllDevices();
        //调用 broadcastMessage("System check message")
        manager.broadcastMessage("System Check Message");
    }
}

abstract class Devices {
    private String brand;
    Devices(String brand) {
        this.brand = brand;
    }
    String getBrand() {
        return this.brand;
    }
    void showBrand() {
        System.out.println("The brand of the device is " + this.brand);
    }
    abstract void powerOn();
}

class Smartphones extends Devices {
    Smartphones(String brand) {
        super(brand);
    }
    void powerOn() {
        System.out.println(getBrand()+" Smartphone is booting up...");
    }
}

class Laptops extends Devices {
    Laptops(String brand) {
        super(brand);
    }
    void powerOn() {
        System.out.println(getBrand()+" Laptop is powering on...");
    }

}

class Tablets extends Devices {
    Tablets(String brand) {
        super(brand);
    }
    void powerOn() {
        System.out.println(getBrand()+" Tablet is starting...");
    }
}

interface MessageProcessor1 {
    void process(String message);
}

class DeviceManager {
    ArrayList<Devices> devices = new ArrayList<>();
    ArrayList<MessageProcessor1> processors = new ArrayList<>();

    void addDevice(Devices device) {
        devices.add(device);
    }

    void addProcessor(MessageProcessor1 processor) {
        processors.add(processor);
    }

    void powerOnAllDevices() {
        for (Devices device : devices) {
            device.powerOn();
        }
    }

    void broadcastMessage(String message) {
        for (MessageProcessor1 processor : processors) {
            processor.process(message);
        }
    }
}

