package ArryList;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //删除元素
        list.remove("aaa");
        //根据索引进行删除
        list.remove(0);
        //修改元素
        list.set(1,"ddd");
        //查询
        list.get(0);
        System.out.println(list);
    }
}
