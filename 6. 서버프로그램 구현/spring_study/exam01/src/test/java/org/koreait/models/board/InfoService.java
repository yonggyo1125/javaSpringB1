package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.board.BoardDataForm;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {
    private final BoardDataDao boardDataDao;

    public BoardData get(long id) {

        return boardDataDao.get(id);
    }
}
