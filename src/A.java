import java.util.*;

public class A {
    public static void main(String[] args) {
//        ArrayList<String> list =new ArrayList<>();
//        list.add("abc");
//        list.add("def");
//        list.forEach(System.out::println);//　lambda表达式遍历集合　
//
//        for (String s : list)
//            System.out.println(s);//foreache循环遍历集合
//        Iterator<String> it=list.iterator();
//        //取到一个集合的迭代器，迭代器用于遍历（循环）集合；
//        while (it.hasNext())//尝试跨越一个元素，能跨越则返回true，否则反回float
//            System.out.println(it.next());//将刚刚越过的元素取出
//        //foreache循环在后台实际上就是用迭代器来完成的
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(8);
//        set.add(7);
//        set.add(6);
//        set.add(5);
//        set.forEach(System.out::println);
//
//        Queue<Integer> queue = new PriorityQueue<>();//优先级队列
//        queue.offer(5);//元素放入队列（入队列）
//        queue.offer(4);
//        queue.offer(3);
//        System.out.println(queue.peek());
//        //查看列表的第一个元素（不取出）
//        System.out.println(queue.poll());
//        //取出队列的第一个元素（出队列）
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);//将元素压入堆栈（入栈）
//        stack.push(5);stack.push(4);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());//将栈的顶元素弹出堆栈（弹栈　出栈）


        Map<String,Integer>map = new TreeMap<>();
        map.put("tom",1);
        map.put("jerry",2);
        map.put("a",2);
        map.put("b",3);
        System.out.println(map.get("tom"));
        System.out.println(map.get("jerry"));
        Set<String>keys =map.keySet();
        //keySet方法的作用是将map中映射的键取出来组成一个Ｓet；
        //但这个Ｓet并不是java．util。Ｓet，而是class　ＫeyＳet
        // ＫeyＳet实际上实现了Ｓet接口，但是其中大部分方法都是抛异常的

        for (String key :map.keySet()){
            System.out.printf("%-5s: %-3d",key,map.get(key));
        }
        System.out.println();
        map.forEach((k,v)->System.out.printf("%-5s: %-3d",k,v ));
    }
}
