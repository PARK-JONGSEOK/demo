package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional(readOnly = true)
	public List<Member> findAll() {
		return memberRepository.findAll();
	}

	@Transactional(readOnly = true)
	public Optional<Member> findById(Long id) {
		return memberRepository.findById(id);
	}

	public Long create(Member member) {
		// todo: 유효성 검사
		// Optional<Member> findMember = memberRepository.findById(member.getId());
		// if (findMember.isPresent()) {
		// throw new Exception("이미 존재하는 회원");
		// }
		Member saveMember = memberRepository.save(member);
		return saveMember.getId();
	}

	public void delete(Long id) {
		memberRepository.deleteById(id);
	}
}
