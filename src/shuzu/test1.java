package shuzu;

public class test1 {
    public static void main(String[] args) {
        int[] arry1 = new int[]{1, 2, 3, 4};
        int[] arry2 = {5, 6, 7, 8, 9};
        String[] arr3 = new String[]{"zhangsan", "lisi", "wangxiaoming"};
        String[] arr4 = {"wangwu", "zhaoliu", "wuqi"};
        double[] arr5 = new double[]{1.23, 1.56};
        double[] arr6 = {1.23, 1.56};
        System.out.println(arr6);
        int arr[] = {1, 2, 3, 4};
        int number = arr[1];
        System.out.println(number);
        System.out.println(arr[0]);
        //把数据存储到数组中
        //格式:数组名[索引] = 变量/具体数值
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
