package shuzu;

public class test2 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        //����ѭ���ı����
        //��ʼ����:0
//        for (int i = 0; i <=4; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(i);
//            //������������ı�����ʽ:
//            //idea�ṩ��
//            //������.fori
        //�����������:
        //����һ�������������:
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        int[]arr2={1,2,3,4,5,6,7,8,9,10};
        int cishu = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%3==0){
                System.out.println(arr2[i]);
                cishu++;
            }
            System.out.println(cishu);

        }

    }
}
