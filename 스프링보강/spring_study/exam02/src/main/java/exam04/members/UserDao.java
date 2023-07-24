package exam04.members;

import exam04.config.ManualBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManualBean
@Repository
public class UserDao {
    private static Map<String, Users> users = new HashMap<>();

    public void register(Users user) {
        String userId = user.getUserId();
        users.put(userId, user);
    }

    public List<Users> gets() {
        List<Users> data = new ArrayList<>(users.values());
        return data;
    }
}
