package ArryList;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class TestPhone {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("С��",2000);
        Phone p2 = new Phone("��Ϊ",5000);
        Phone p3 = new Phone("����",4000);
        Phone p4 = new Phone("ƻ��",10000);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ArrayList<Phone> phoneinfolist = getPhoneInfo(list);
        for (int i = 0; i < phoneinfolist.size(); i++) {
            Phone phone = phoneinfolist.get(i);
            System.out.println(phone.getBrand()+phone.getPrice());
        }
    }
    //���ض�����ݷŵ�һ��������,�ٰ���������
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price<3000){
                resultlist.add(p);
            }

        }
        return resultlist;
    }

}
