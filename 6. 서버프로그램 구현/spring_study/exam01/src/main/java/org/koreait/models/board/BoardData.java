package org.koreait.models.board;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BoardData {
    private long id;

    @JsonIgnore
    private String poster;

    private String subject;
    private String content;

    @JsonFormat(pattern="yyyy.MM.dd HH:mm")
    private LocalDateTime regDt;

    @JsonFormat(pattern="yyyy.MM.dd HH:mm")
    private LocalDateTime modDt;
}
