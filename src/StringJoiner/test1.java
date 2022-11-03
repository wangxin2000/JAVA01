package StringJoiner;

import java.util.StringJoiner;

public class test1 {
    public static void main(String[] args) {
        //创建一个对象,并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("-----");
        sj.add("nihao").add("ccc");

    }
}
