package StringBuilder;

public class test2ƴ���ַ��� {
    public static void main(String[] args) {
        //��������
        int[] arr = {1,2,3};
        //�������齫�������ַ���
    }
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }

        }
        sb.append("]");
        return sb.toString();
    }

}
