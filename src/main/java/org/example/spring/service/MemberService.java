package org.example.spring.service;

import lombok.RequiredArgsConstructor;
import org.example.spring.domain.Member;
import org.example.spring.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public Member getMember(Long id) {
        return memberRepository.findById(id);
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}
