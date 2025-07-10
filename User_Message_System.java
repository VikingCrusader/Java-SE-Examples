//你正在设计一个简易的信息系统，用户可以向系统发送消息，而系统可以对消息做出不同的处理，比如：
//
//正常打印
//
//        显示消息长度
//
//消息加密（反转字符串）
//
//高亮显示（加上特殊符号）
import java.util.*;
public class User_Message_System {
    public static void main(String[] args) {
        //用普通类实现，打印消息内容
        Print p = new Print();
        System.out.println("我是普通类打印出来的");
        p.process("Hello World!");
        //显示消息长度（如：消息长度为：X）
        MessageProcessor p1 = (message) -> System.out.println("这是Lambda打印出来的,字符串长度为："+message.length());
        p1.process("Hello World!");
        //用 Lambda 实现，将消息内容反转后输出（如："olleH"）
        MessageProcessor p2 = (message) -> {
            String reversed = new StringBuffer(message).reverse().toString();
            System.out.println("The reversed string is:"+reversed);
        };
        p2.process("Hello World!");
        //用 Lambda 实现，在消息前后加上 *** 输出（如："Hello"）
        MessageProcessor p3 = (message) -> {
            LinkedList<String> list = new LinkedList<>();
            list.add(message);
            list.addFirst("*****");
            list.addLast("*****");
            String result = String.join(" ", list);
            System.out.println(result);
        };
        p3.process("Hello World!");

    }
}

interface MessageProcessor {
    void process(String message);
}

class Print implements MessageProcessor {
    public void process(String message){
        System.out.println("The message is: "+message);
    }
}