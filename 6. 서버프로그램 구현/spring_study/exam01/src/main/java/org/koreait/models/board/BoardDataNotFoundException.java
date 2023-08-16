package org.koreait.models.board;

import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;

public class BoardDataNotFoundException extends CommonException {
    public BoardDataNotFoundException() {
        super("등록된 게시글이 아닙니다.", HttpStatus.BAD_REQUEST);
    }
}
