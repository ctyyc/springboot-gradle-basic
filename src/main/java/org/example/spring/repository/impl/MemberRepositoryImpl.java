package org.example.spring.repository.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring.domain.Member;
import org.example.spring.repository.MemberRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member findById(Long id) {
        return memberJpaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Member> findAll() {
        return memberJpaRepository.findAll();
    }

    @Override
    public Member save(Member member) {
        return memberJpaRepository.save(member);
    }

    @Override
    public void deleteById(Long id) {
        memberJpaRepository.deleteById(id);
    }
}
