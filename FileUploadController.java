package com.jution.fileServer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class FileUploadController {

    private final S3Upload s3Upload;

    @PostMapping("/upload")
    public ResponseEntity uploadFile(@RequestParam("images") MultipartFile multipartFile,
                                     @RequestParam("fileSize") int fileSize) throws IOException {

        String resource = s3Upload.upload(multipartFile.getInputStream(), multipartFile.getOriginalFilename(), fileSize);

        return new ResponseEntity<> (resource, HttpStatus.CREATED);
    }

}