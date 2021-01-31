package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MemberController {

	private final Logger logger = LoggerFactory.getLogger(MemberController.class);
	private final MemberService memberService;

	@GetMapping("/members")
	public List<Member> members() {
		return memberService.findAll();
	}

	@GetMapping("/members/{id}")
	public Optional<Member> member(@PathVariable("id") Long id) {
		return memberService.findById(id);
	}

	@PostMapping("/members")
	public Long join(@RequestBody Member member) {
		// departMent에 잘못된 값이 들어오면 null 처리한다.
		return memberService.create(member);
	}

	@DeleteMapping("/members/{id}")
	public Long delete(@PathVariable("id") Long id) {
		memberService.delete(id);
		return id;
	}
}
