package com.example.api.service;

import com.example.api.entity.Member;
import com.example.api.exception.MemberNotFoundException;
import com.example.api.repository.LoginRepository;
import com.example.api.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginRepository loginRepository;

    public Long login(String email, String password) {
        Member findMember = loginRepository.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new MemberNotFoundException("이메일 또는 패스워드가 틀렸습니다."));
        return findMember.getId();
    }

}
