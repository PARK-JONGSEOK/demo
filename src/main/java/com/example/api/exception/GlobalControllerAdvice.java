package com.example.api.exception;

import com.example.api.controller.LoginController;
import com.example.api.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = {LoginController.class})
public class GlobalControllerAdvice {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<ErrorDto> memberNotFoundException(MemberNotFoundException error) {
        ErrorDto errorDto = new ErrorDto(error.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDto);
    }
}
