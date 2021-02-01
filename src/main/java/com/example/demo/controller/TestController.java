package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	// @CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/ip")
	public static ResponseEntity<String> ip(HttpServletRequest request) {
		// 요청을 보낸 클라이언트의 ip주소를 반환합니다.
		return ResponseEntity.ok(request.getRemoteAddr());
	}
}
