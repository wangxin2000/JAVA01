package ArryList;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("xiaoming",11);
        Student s2 = new Student("lisi",11);
        Student s3 = new Student("wangwu",11);
        Student s4 = new Student("zhaoliu",11);
        //Ìí¼ÓÔªËØ
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());

        }
    }
}
