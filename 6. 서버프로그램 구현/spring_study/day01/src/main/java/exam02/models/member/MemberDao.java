package exam02.models.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao {
    private static Map<String, Member> members = new HashMap<>();

    public void register(Member member) {
        if (member == null) {
            return;
        }

        String userId = member.getUserId();
        members.put(userId, member);
    }

    public boolean exists(String userId) {

        return members.containsKey(userId);
    }

    public Member get(String userId) {

        return members.get(userId);
    }

    public List<Member> gets() {
        return new ArrayList<Member>(members.values());
    }
}
