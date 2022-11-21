package ArryList;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<UserInformation> list = new ArrayList<>();
        UserInformation user1 = new UserInformation("001","xiaoming","211324wx");
        UserInformation user2 = new UserInformation("002","xiaolin","211324wx");
        UserInformation user3 = new UserInformation("003","xiaofeng","211324wx");
        UserInformation user4 = new UserInformation("004","xiaoxin","211324wx");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        for (int i = 0; i < list.size(); i++) {
            UserInformation UI = list.get(i);
            System.out.println(UI.id+UI.password+UI.username);
        }
    }
}
