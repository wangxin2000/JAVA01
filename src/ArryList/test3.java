package ArryList;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //����¼��
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("������ѧ������:");
            String name = sc.next();
            System.out.println("������ѧ������:");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            //��ѧ��������ӵ�������
            list.add(s);
        }
        //����
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
    }
}
