// LinkedList<Integer> list = new LinkedList<>();

// list.add(10);               // 添加到尾部
// list.addFirst(5);           // 添加到头部
// list.addLast(20);           // 添加到尾部（等同于 add）
// list.getFirst();            // 获取第一个元素
// list.getLast();             // 获取最后一个元素
// list.removeFirst();         // 删除第一个元素
// list.removeLast();          // 删除最后一个元素
// list.contains(10);          // 判断是否包含元素
// list.size();                // 获取大小

// 🧪 小练习：购物清单管理器
// 📋 要求
// 创建一个 LinkedList<String> 表示购物清单

// 添加一些商品：牛奶、鸡蛋、面包、苹果、咖啡

// 在最前面插入“牙膏”，在最后加上“矿泉水”

// 输出完整清单

// 删除头部和尾部的两个商品

// 检查是否包含“鸡蛋”

// 输出最终清单

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("milk");
        li.add("egg");
        li.add("bread");
        li.add("apple");
        li.add("coffee");
        li.addFirst("yagao");
        li.addLast("mineral water");
        System.out.println(li);
        li.removeFirst();
        li.removeFirst();
        li.removeLast();
        li.removeLast();
        li.contains("egg");
        System.out.println(li);
    }
}
