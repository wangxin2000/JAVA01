package ArryList;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //���Ԫ��
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //ɾ��Ԫ��
        list.remove("aaa");
        //������������ɾ��
        list.remove(0);
        //�޸�Ԫ��
        list.set(1,"ddd");
        //��ѯ
        list.get(0);
        System.out.println(list);
    }
}
