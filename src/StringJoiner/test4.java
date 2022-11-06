package StringJoiner;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //罗马数字的两种写法

        String str;
        //键盘录入的代码
        Scanner sc = new Scanner(System.in);
        //校验长度小于9,必须都是数字
        while (true) {
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("输出不符合规则,请重新输入");
                continue;
            }
        }
        //将内容变成罗马数字
        //查表法,数字和数据产生对应关系
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
            int number = c - 48;
            String s = changeLuoMa(number);
//            System.out.println(s);
            sb.append(s);
            System.out.println(sb);

        }

    }

    public static String changeLuoMa(int number){
        String[] arr = {"","一","二","三","四","五","六","七","八","九"};
        return arr[number];
    }
    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c<'0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
