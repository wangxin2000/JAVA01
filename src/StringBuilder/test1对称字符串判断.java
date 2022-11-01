package StringBuilder;

import java.util.Scanner;

public class test1对称字符串判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串:");
        String str1 = sc.next();
//        StringBuilder sb = new StringBuilder();
//        sb.append(str1);
//        sb.reverse();
//        System.out.println(sb);
        //使用stringbuilder的场景
        // 1字符串的拼接
        // 2字符串的反转
        String result = new StringBuilder().append(str1).reverse().toString();
        System.out.println(result);
        //比较
        if (str1.equals(result)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
