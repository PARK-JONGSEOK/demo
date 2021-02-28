package com.example.api.dto;

import lombok.Getter;

@Getter
public class ErrorDto {
    private String message;

    public ErrorDto(String message) {
        this.message = message;
    }
}
