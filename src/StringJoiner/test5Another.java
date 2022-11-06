package StringJoiner;

public class test5Another {
    public static void main(String[] args) {

    }
    public static String rotate(String str){
        char[] arr = str.toCharArray();
        //ÄÃµ½0Ë÷ÒýµÄ×Ö·û
        char first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }
}
