package StringJoiner;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //�������ֵ�����д��

        String str;
        //����¼��Ĵ���
        Scanner sc = new Scanner(System.in);
        //У�鳤��С��9,���붼������
        while (true) {
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("��������Ϲ���,����������");
                continue;
            }
        }
        //�����ݱ����������
        //���,���ֺ����ݲ�����Ӧ��ϵ
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
        String[] arr = {"","һ","��","��","��","��","��","��","��","��"};
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
