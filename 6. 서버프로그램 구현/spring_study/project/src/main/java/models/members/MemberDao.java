package models.members;

import controllers.member.JoinForm;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDao {

    private final JdbcTemplate jdbcTemplate;

    public boolean register(JoinForm joinForm) {

    }

    public boolean exists(String userId) {

    }
}
