package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.UserType;

import java.time.LocalDateTime;

@Data @Builder @Entity
@NoArgsConstructor @AllArgsConstructor
@Table(name="ES_MEMBER",
        indexes = {
            @Index(name="idx_regdt_desc", columnList = "regDt DESC"),
                @Index(name="idx_email_mobile", columnList = "email, mobile")
        })
public class Users extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNo;

    @Column(name="memId", length=45, unique=true, nullable=false)
    private String userId;

    @Column(length=65, nullable=false)
    private String userPw;

    @Column(length=45, nullable=false)
    private String userNm;

    @Column(length=100, nullable = false)
    private String email;

    @Column(length=11)
    private String mobile;

    @Transient
    private String intro;

    @Enumerated(EnumType.STRING)
    @Column(length=10, nullable = false)
    private UserType userType = UserType.MEMBER;
}
