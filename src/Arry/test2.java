package Arry;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        System.out.println(list);
        //删除元素
        boolean result = list.remove("aaa");
        System.out.println(result);
        System.out.println(list);
        //根据索引进行删除,返回被删除元素
        String str = list.remove(0);
        //修改,将旧元素的数值进行返回
        String str2 = list.set(1, "ddd");
        System.out.println(str2);
        //查询元素,返回查询到的数值
        String s = list.get(0);
        System.out.println(s);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i表示索引
            String s1 = list.get(i);
            System.out.println(s1);
        }
    }
}
