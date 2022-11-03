package StringJoiner;

import java.util.StringJoiner;

public class test2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("aaa").add("bbb");
        System.out.println(sj);
        int len = sj.length();
        System.out.println(len);
        String s = sj.toString();
        System.out.println(s);
    }
}
