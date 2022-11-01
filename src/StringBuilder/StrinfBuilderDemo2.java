package StringBuilder;

public class StrinfBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        /*添加元素方法*/
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        System.out.println(sb);
        /*变成字符串方法*/
        String str = sb.toString();
        System.out.println(str);
    }
}
