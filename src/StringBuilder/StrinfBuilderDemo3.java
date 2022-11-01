package StringBuilder;

import java.util.Scanner;

public class StrinfBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法的时候,不需要使用变量接受其他结果
        String s = getString();
        s.length();
        int len = getString().substring(1).replace("a","q").length();
        System.out.println(len);
        //创建对象
        StringBuilder sb = new StringBuilder();
        //添加字符串
        sb.append("abc").append("def");
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符:");
        String str = sc.next();
        return str;
    }
}
