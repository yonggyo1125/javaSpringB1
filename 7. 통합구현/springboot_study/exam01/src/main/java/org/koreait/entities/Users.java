package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.UserType;

import java.time.LocalDateTime;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Table(name="MEMBER",
    indexes = {
        @Index(name="idx_Users_regDt", columnList = "regDt DESC"),
            @Index(name="idx_Users_userNm", columnList = "userNm")
    })
public class Users extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNo;
    @Column(name="memId")
    private String userId;
    private String userPw;
    private String userNm;
    //@Lob
    @Transient
    private String intro;

    @Enumerated(EnumType.STRING)
    private UserType type = UserType.USER;
}
