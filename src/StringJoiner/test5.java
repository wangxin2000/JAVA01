package StringJoiner;
//调整字符串
public class test5 {
    public static void main(String[] args) {
        //定义连个字符串
        String strA = "abcde";
        String strB = "cdeab";
        //旋转字符串
        strA = rotate(strA);
        //循环的上限
        //循环旋转并比较
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
    //作用:旋转字符串,把左边的字符转移到右侧去
    //形参:旋转之前的字符串
    //返回值:旋转后的字符串
    public static String rotate(String str){
        //修改字符串之中的内容substring进行截取,把左边的字符串转移到右边去
        //可以把字符串变成一个字符数组,然后调整字符数组之中的数据,再将数组变化为字符串.

        //截取思路
        //String substring = str.substring(0, 1);
        //charat(0);
        char first = str.charAt(0);
        //获取剩余的字符
        String end = str.substring(1);
        return  end + first;
    }
}
