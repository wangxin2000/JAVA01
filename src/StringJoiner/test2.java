package StringJoiner;

import java.util.StringJoiner;

public class test2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("aaa").add("bbb");
        System.out.println(sj);
    }
}
