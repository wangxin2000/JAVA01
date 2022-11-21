package ArryList;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生年龄:");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            //把学生对象添加到集合中
            list.add(s);
        }
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
    }
}
