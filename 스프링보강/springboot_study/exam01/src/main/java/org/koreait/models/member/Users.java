package org.koreait.models.member;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Users {
    private long userNo;
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
}
