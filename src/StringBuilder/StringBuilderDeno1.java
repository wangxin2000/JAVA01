package StringBuilder;

public class StringBuilderDeno1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        //调用成员方法
        /*添加方法*/
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        /*反转方法*/
        sb.reverse();
        /*获取长度方法*/
        int len = sb.length();
        System.out.println(len);
        System.out.println(sb);
        //打印属性值而不是地址值
    }
}
