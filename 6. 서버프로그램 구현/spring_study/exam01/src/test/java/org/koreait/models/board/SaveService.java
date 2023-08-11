package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.board.BoardDataForm;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveService {

    private final BoardSaveValidator validator;
    private final BoardDataDao boardDataDao;

    public void save(BoardDataForm data) {
        validator.check(data);

        boardDataDao.save(data);
    }
}
