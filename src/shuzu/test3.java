package shuzu;

public class test3 {
    public static void main(String[] args) {
        //������ָ�����鳤��,��������г�ʼ��.
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        //��̬��ʼ�����������ѧ����Ϣ
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //��������Ĭ�ϳ�ʼ����ֵ��0;
        // С������Ĭ�ϳ�ʼ����ֵΪ0.0;
        // �ַ�����Ĭ�ϳ�ʼ��ֵΪ'/u00000'�ո�;
        // ��������Ĭ�ϳ�ʼ��ֵΪfalse;
        //null���ǿ�ָ��

    }
}
