package StringBuilder;

import java.util.Scanner;

public class StrinfBuilderDemo3 {
    public static void main(String[] args) {
        //��ʽ���
        //�������ڵ���һ��������ʱ��,����Ҫʹ�ñ��������������
        String s = getString();
        s.length();
        int len = getString().substring(1).replace("a","q").length();
        System.out.println(len);
        //��������
        StringBuilder sb = new StringBuilder();
        //����ַ���
        sb.append("abc").append("def");
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�:");
        String str = sc.next();
        return str;
    }
}
