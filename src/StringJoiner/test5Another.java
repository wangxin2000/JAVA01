package StringJoiner;

public class test5Another {
    public static void main(String[] args) {

    }
    public static String rotate(String str){
        char[] arr = str.toCharArray();
        //�õ�0�������ַ�
        char first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }
}
