package models.member;

import java.util.HashMap;
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
}
