// 创建一个 List<Integer> 用于存储学生成绩，实现以下功能：

// 添加 5 个成绩（任意整数）。

// 输出所有成绩。

// 输出最高分、最低分和平均分。

// 删除一个指定成绩（例如删除 60）。

// 输出删除后的成绩列表。
import java.util.*;
public class arraylist{
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(40);
        li.add(0,100);
        int b = li.get(0);
        System.out.println(li);
        System.out.println(b);
        li.set(0,30);
        System.out.println(li);
        li.remove(0);
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.contains(1));
        for(int x : li){
            System.out.println(x);
        }
        li.clear();
        System.out.println(li);
        System.out.println("接下来做例子");
        List<Integer> scores = new ArrayList<>();
        scores.add(96);
        scores.add(98);
        scores.add(55);
        scores.add(94);
        scores.add(65);
        for (int x:scores){
            System.out.println(x);
        }
        scores.sort(Comparator.naturalOrder());
        System.out.println("打印最高分");
        System.out.println(scores.get(scores.size()-1));
        System.out.println("打印最低分");
        System.out.println(scores.get(0));
        int sum = 0;
        for (int x : scores) {
            sum += x;
        }
        int avg = sum / scores.size();
        System.out.println(avg);
        scores.remove(0);
        System.out.println(scores);
    }

}