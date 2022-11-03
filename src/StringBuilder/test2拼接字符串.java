package StringBuilder;

public class test2拼接字符串 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3};
        //调用数组将数组变成字符串
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
