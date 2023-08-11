package org.koreait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="ES_MEMBER",
        indexes = {
            @Index(name="idx_regdt_desc", columnList = "regDt DESC"),
                @Index(name="idx_email_mobile", columnList = "email, mobile")
        })
public class Users {
    @Id
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
