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
import java.util.ArrayList;
import java.util.List;

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
   //@Column(name="memId")
    @Column(length=45, unique = true, nullable = false)
    private String userId;

    @Column(length=65, nullable = false)
    private String userPw;

    @Column(length=45, nullable = false)
    private String userNm;
    //@Lob
    @Transient
    private String intro;

    @Enumerated(EnumType.STRING)
    @Column(length=10, nullable = false)
    private UserType type = UserType.USER;

    @OneToMany(mappedBy = "user")
    private List<BoardData> boardDatas = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="profile_id")
    private UserProfile profile;
}
