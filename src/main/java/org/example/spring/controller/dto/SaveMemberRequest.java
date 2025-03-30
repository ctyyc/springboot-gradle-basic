package org.example.spring.controller.dto;

import lombok.Data;

@Data
public class SaveMemberRequest {
    private String name;
    private String email;
}
