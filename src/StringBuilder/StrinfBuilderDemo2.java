package StringBuilder;

public class StrinfBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        /*���Ԫ�ط���*/
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        System.out.println(sb);
        /*����ַ�������*/
        String str = sb.toString();
        System.out.println(str);
    }
}
