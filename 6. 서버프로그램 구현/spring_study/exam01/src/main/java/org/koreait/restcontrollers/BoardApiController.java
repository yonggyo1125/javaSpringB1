package org.koreait.restcontrollers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.commons.CommonException;
import org.koreait.commons.JSONData;
import org.koreait.controllers.board.BoardDataForm;
import org.koreait.models.board.BoardData;
import org.koreait.models.board.InfoService;
import org.koreait.models.board.SaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final SaveService saveService;
    private final InfoService infoService;

    /**
    @GetMapping("/info/{id}")
    public ResponseEntity<BoardData> info(@PathVariable long id) {
        BoardData data = infoService.get(id);

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
     */
    @GetMapping("/info/{id}")
    public ResponseEntity<JSONData<BoardData>> info(@PathVariable long id) {
        BoardData data = infoService.get(id);

        JSONData<BoardData> jsonData = new JSONData<>();
        jsonData.setSuccess(true);
        jsonData.setStatus(HttpStatus.OK);
        jsonData.setData(data);

        return ResponseEntity.status(jsonData.getStatus()).body(jsonData);
    }

    @GetMapping("/list")
    public List<BoardData> list() {
        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            BoardData data = BoardData.builder()
                    .id(i)
                    .subject("제목" + i)
                    .content("내용" + i)
                    .poster("작성자" + i)
                    .regDt(LocalDateTime.now())
                    .build();
            items.add(data);
        }
        return items;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/process")
    public void process() {
        log.info("내부 처리중....");
    }

    @PostMapping("/register")
    public ResponseEntity<JSONData<Object>> register(@RequestBody @Valid BoardDataForm form, Errors errors) {
        JSONData<Object> jsonData = new JSONData<>();
        /*
        if (errors.hasErrors()) {
            String errMessage = errors.getAllErrors()
                                    .stream()
                                    .map(e -> e.getDefaultMessage())
                                    .collect(Collectors.joining(","));
            throw new CommonException(errMessage, HttpStatus.BAD_REQUEST);
        }
        */

        saveService.save(form);

        jsonData.setStatus(HttpStatus.CREATED);
        jsonData.setSuccess(true);
        return ResponseEntity.status(jsonData.getStatus()).body(jsonData);

        //return ResponseEntity.status(HttpStatus.CREATED).build();
        //return ResponseEntity.created(URI.create("/board/list")).build(); // 201
    }
    /*
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData<Object>> errorHandler(Exception e) {
        JSONData<Object> jsonData = new JSONData<>();
        jsonData.setMessage(e.getMessage());

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException) {
            CommonException e2 = (CommonException)e;
            status = e2.getStatus();
        }

        return ResponseEntity.status(status).body(jsonData);
    }
     */
}
