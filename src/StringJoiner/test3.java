package StringJoiner;

public class test3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abcqweerrrrrrrrrrrr");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //¿œ»›¡ø*2+2

    }
}
