package org.example.spring.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.spring.controller.dto.SaveMemberRequest;
import org.example.spring.domain.Member;
import org.example.spring.service.MemberService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public ResponseEntity<List<Member>> getMembers() {
        return ResponseEntity.ok(memberService.getMembers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMember(@PathVariable Long id) {
        return ResponseEntity.ok(memberService.getMember(id));
    }

    @PostMapping(path = "", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> createMember(
            @RequestPart("request")
            SaveMemberRequest request,
            @RequestPart("firstFileList")
            List<MultipartFile> firstFileList,
            @RequestPart("secondFileList")
            List<MultipartFile> secondFileList
//            @ModelAttribute
//            UploadFileRequest uploadFileRequest
    ) {
        log.info(">>> request: {}", request);
        firstFileList.forEach(file ->
                log.info(">>> first file: {}, {}", file.getOriginalFilename(), file.getContentType())
        );
        secondFileList.forEach(file ->
                log.info(">>> second file: {}, {}", file.getOriginalFilename(), file.getContentType())
        );
        return ResponseEntity.ok("OK");
    }
}
