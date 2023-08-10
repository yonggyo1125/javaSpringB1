package controllers.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file/upload")
public class UploadController {

    @GetMapping
    public String upload() {

        return "file/upload";
    }

    @PostMapping
    public String uploadPs(MultipartFile[] files) {
        try {
            for (MultipartFile file : files) {
                File dest = new File("D://uploads", file.getOriginalFilename());
                file.transferTo(dest);
            }
        } catch (IOException e) {}


        return "file/upload";
    }
}
