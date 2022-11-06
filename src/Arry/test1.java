package Arry;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>;//泛型,集合中存储数据的类型<E>泛型 尖括号中放数据类型
        //jdk之后:
        ArrayList<String> list = new ArrayList<>();
        //打印的不是地址值,而是存储的数据内容[] 两个括号进行包裹
        System.out.println(list);
    }
}
