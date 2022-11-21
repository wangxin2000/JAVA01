package shuzu;

public class test3 {
    public static void main(String[] args) {
        //有我们指定数组长度,虚拟机进行初始化.
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        //动态初始化创建并添加学生信息
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //整数类型默认初始化数值是0;
        // 小数类型默认初始化数值为0.0;
        // 字符类型默认初始化值为'/u00000'空格;
        // 布尔类型默认初始化值为false;
        //null就是空指针

    }
}
