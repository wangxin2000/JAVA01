package Arry;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //����һ������
        ArrayList<String> list = new ArrayList<>();
        //���Ԫ��
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        System.out.println(list);
        //ɾ��Ԫ��
        boolean result = list.remove("aaa");
        System.out.println(result);
        System.out.println(list);
        //������������ɾ��,���ر�ɾ��Ԫ��
        String str = list.remove(0);
        //�޸�,����Ԫ�ص���ֵ���з���
        String str2 = list.set(1, "ddd");
        System.out.println(str2);
        //��ѯԪ��,���ز�ѯ������ֵ
        String s = list.get(0);
        System.out.println(s);

        //����
        for (int i = 0; i < list.size(); i++) {
            //i��ʾ����
            String s1 = list.get(i);
            System.out.println(s1);
        }
    }
}
