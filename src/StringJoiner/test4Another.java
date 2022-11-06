package StringJoiner;

public class test4Another {
    public static void main(String[] args) {
        //利用Switch选择罗马数字
    }

    public static String changeLuoMa(char number){
//        String str;
//        switch (number){
//            case '0' -> str = "";
//            default -> str = " ";
//
//        }
//        jdk12新写法
        String str = switch (number){
            case '0' ->"";
            default -> " ";
        };

        return str;
        }
}
