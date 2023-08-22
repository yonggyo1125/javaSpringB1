package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.koreait.constants.UserType;

@Entity
@Data @Builder
@AllArgsConstructor @NonNull
public class Users extends BaseEntity {
    @Id @GeneratedValue
    private Long userNo;

    @Column(length=45, nullable = false, unique = true)
    private String userId;

    @Column(length=65, nullable = false)
    private String userPw;

    @Column(length=45, nullable = false)
    private String userNm;

    @Enumerated(EnumType.STRING)
    @Column(length=10, nullable = false)
    private UserType type = UserType.USER;
}
