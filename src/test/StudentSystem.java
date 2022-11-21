package test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------------��ӭ����ѧ������ϵͳ-------------------");
            System.out.println("1:���ѧ��");
            System.out.println("2:ɾ��ѧ��");
            System.out.println("3:�޸�ѧ��");
            System.out.println("4:��ѯѧ��");
            System.out.println("5:�˳�");
            System.out.println("����������ѡ��");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("�˳�");
                    //break loop;
                    System.exit(0);//ֹͣ���������
                }
                default -> System.out.println("û�����ѡ��");
            }
        }
    }

    //���ѧ��
    public static void addStudent(ArrayList<Student> list) {
        //���ÿղι����ȴ���ѧ������
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("������ѧ����id");
            id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                //��ʾid�Ѿ����ڣ���Ҫ����¼��
                System.out.println("id�Ѿ����ڣ�������¼��");
            }else{
                //��ʾid�����ڣ���ʾ����ʹ��
                s.setId(id);
                break;
            }
        }

        System.out.println("������ѧ��������");
        String name = sc.next();
        s.setName(name);

        System.out.println("������ѧ��������");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("������ѧ���ļ�ͥסַ");
        String address = sc.next();
        s.setAddress(address);


        //��ѧ��������ӵ����ϵ���
        list.add(s);

        //��ʾһ���û�
        System.out.println("ѧ����Ϣ��ӳɹ�");
    }

    //ɾ��ѧ��
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫɾ����id");
        String id = sc.next();
        //��ѯid�ڼ����е�����
        int index = getIndex(list, id);
        //��index�����ж�
        //���-1���ͱ�ʾ�����ڣ������������ص���ʼ�˵�
        if(index >= 0){
            //������ڵ���0�ģ���ʾ���ڣ�ֱ��ɾ��
            list.remove(index);
            System.out.println("idΪ��" + id + "��ѧ��ɾ���ɹ�");
        }else{
            System.out.println("id�����ڣ�ɾ��ʧ��");
        }
    }

    //�޸�ѧ��
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ�޸�ѧ����id");
        String id = sc.next();

        int index = getIndex(list, id);

        if(index == -1){
            System.out.println("Ҫ�޸ĵ�id" + id + "�����ڣ�����������");
            return;
        }

        //������ִ�е������ʾʲô����ʾ��ǰid�Ǵ��ڵġ�
        //��ȡҪ�޸ĵ�ѧ������
        Student stu = list.get(index);

        //������������Ϣ���޸�
        System.out.println("������Ҫ�޸ĵ�ѧ������");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("������Ҫ�޸ĵ�ѧ������");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("������Ҫ�޸ĵ�ѧ����ͥסַ");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("ѧ����Ϣ�޸ĳɹ�");


    }


    //��ѯѧ��
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("��ǰ��ѧ����Ϣ������Ӻ��ٲ�ѯ");
            //��������
            return;
        }

        //��ӡ��ͷ��Ϣ
        System.out.println("id\t\t����\t����\t��ͥסַ");
        //������ִ�е������ʾ�������������ݵ�
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }


    //�ж�id�ڼ������Ƿ����
    public static boolean contains(ArrayList<Student> list, String id) {
        //ѭ���������ϵõ������ÿһ��ѧ������
        /*for (int i = 0; i < list.size(); i++) {
            //�õ�ѧ������󣬻�ȡid�������ж�
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                //���ڣ�true
                return true;
            }
        }
        // ������false
        return false;*/
        return getIndex(list,id) >= 0;
    }

    //ͨ��id��ȡ�����ķ���
    public static int getIndex(ArrayList<Student> list, String id){
        //��������
        for (int i = 0; i < list.size(); i++) {
            //�õ�ÿһ��ѧ������
            Student stu = list.get(i);
            //�õ�ÿһ��ѧ�������id
            String sid = stu.getId();
            //���ż����е�ѧ��id��Ҫ��ѯ��id���бȽ�
            if(sid.equals(id)){
                //���һ������ô�ͷ�������
                return i;
            }
        }
        //��ѭ������֮��û���ҵ����ͱ�ʾ�����ڣ�����-1.
        return -1;
    }
}
