package com.example.api;

import com.example.api.entity.Member;
import com.example.api.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ApiApplication {

    private final MemberRepository memberRepository;

    @Autowired
    public ApiApplication(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostConstruct
    public void initData() {
        memberRepository.save(new Member("test@gmail.com", "1234567", "테스트"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
