package StringJoiner;
//�����ַ���
public class test5 {
    public static void main(String[] args) {
        //���������ַ���
        String strA = "abcde";
        String strB = "cdeab";
        //��ת�ַ���
        strA = rotate(strA);
        //ѭ��������
        //ѭ����ת���Ƚ�
        boolean result = check(strA,strB);
        System.out.println(result);
    }
    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    //����:��ת�ַ���,����ߵ��ַ�ת�Ƶ��Ҳ�ȥ
    //�β�:��ת֮ǰ���ַ���
    //����ֵ:��ת����ַ���
    public static String rotate(String str){
        //�޸��ַ���֮�е�����substring���н�ȡ,����ߵ��ַ���ת�Ƶ��ұ�ȥ
        //���԰��ַ������һ���ַ�����,Ȼ������ַ�����֮�е�����,�ٽ�����仯Ϊ�ַ���.

        //��ȡ˼·
        //String substring = str.substring(0, 1);
        //charat(0);
        char first = str.charAt(0);
        //��ȡʣ����ַ�
        String end = str.substring(1);
        return  end + first;
    }
}
