package StringJoiner;

public class test4Another {
    public static void main(String[] args) {
        //����Switchѡ����������
    }

    public static String changeLuoMa(char number){
//        String str;
//        switch (number){
//            case '0' -> str = "";
//            default -> str = " ";
//
//        }
//        jdk12��д��
        String str = switch (number){
            case '0' ->"";
            default -> " ";
        };

        return str;
        }
}
