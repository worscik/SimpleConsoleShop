package SystemUsers;

import java.util.ArrayList;
import java.util.List;

public class SystemUsers {

    List<String> systemUsersList = new ArrayList<>();

    public void addUser(String user) {
        systemUsersList.add(user);
    }

    public void removeUser(String user) {
        systemUsersList.remove(user);
    }

    public void listUsers() {
        for (String listUser : systemUsersList) {
            System.out.println(listUser);
        }
    }


}
