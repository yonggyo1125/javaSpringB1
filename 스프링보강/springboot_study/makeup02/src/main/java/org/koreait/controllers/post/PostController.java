package org.koreait.controllers.post;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.PostData;
import org.koreait.repositories.PostDataRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostDataRepository repository;

    @GetMapping("/test")
    public void test() {
        PostData data = PostData.builder()
                .subject("제목1")
                .content("내용1")
                .build();

        repository.saveAndFlush(data);
    }

    @GetMapping("/test2")
    public void test2() {
        PostData data = repository.findById(1L).orElse(null);
        data.setSubject("(수정)제목1");

        repository.flush();
    }
}
