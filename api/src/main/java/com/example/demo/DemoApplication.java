package com.example.demo;

import com.example.demo.entity.Department;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private MemberService memberService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Member a = new Member("AAA", Department.TOKYO);
        Member b = new Member("BBB", Department.OSAKA);
        Member c = new Member("CCC", Department.TOKYO);
        Member d = new Member("DDD", Department.OSAKA);
        Member e = new Member("FFF", Department.TOKYO);


        memberService.create(a);
        memberService.create(b);
        memberService.create(c);
        memberService.create(d);
        memberService.create(e);
    }

}
