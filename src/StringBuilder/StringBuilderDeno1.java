package StringBuilder;

public class StringBuilderDeno1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        //���ó�Ա����
        /*��ӷ���*/
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        /*��ת����*/
        sb.reverse();
        /*��ȡ���ȷ���*/
        int len = sb.length();
        System.out.println(len);
        System.out.println(sb);
        //��ӡ����ֵ�����ǵ�ֵַ
    }
}
