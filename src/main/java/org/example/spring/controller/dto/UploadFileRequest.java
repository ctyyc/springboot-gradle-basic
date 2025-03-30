package org.example.spring.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class UploadFileRequest {
    @Schema(description = "첫 번째 파일 목록")
    private List<MultipartFile> firstFileList;

    @Schema(description = "두 번째 파일 목록")
    private List<MultipartFile> secondFileList;
}
