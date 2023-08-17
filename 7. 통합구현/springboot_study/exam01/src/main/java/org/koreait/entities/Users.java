package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Table(name="MEMBER",
    indexes = {
        @Index(name="idx_Users_regDt", columnList = "regDt DESC"),
            @Index(name="idx_Users_userNm", columnList = "userNm")
    })
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    @Lob
    private String intro;

    @CreationTimestamp
    private LocalDateTime regDt;

    @UpdateTimestamp
    private LocalDateTime modDt;
}
