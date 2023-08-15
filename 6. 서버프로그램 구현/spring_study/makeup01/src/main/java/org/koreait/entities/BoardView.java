package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@IdClass(BoardViewId.class)
public class BoardView {
    @Id
    private Long id; // 게시글 ID
    @Id
    @Column(name="_uid")
    private Integer uid; // user-agent + IP + 회원번호(비회원 0)
}
