package StringBuilder;

import java.util.Scanner;

public class test1�Գ��ַ����ж� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ���ַ���:");
        String str1 = sc.next();
//        StringBuilder sb = new StringBuilder();
//        sb.append(str1);
//        sb.reverse();
//        System.out.println(sb);
        //ʹ��stringbuilder�ĳ���
        // 1�ַ�����ƴ��
        // 2�ַ����ķ�ת
        String result = new StringBuilder().append(str1).reverse().toString();
        System.out.println(result);
        //�Ƚ�
        if (str1.equals(result)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
