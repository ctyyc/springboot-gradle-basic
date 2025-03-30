package org.example.spring.repository;

import org.example.spring.domain.Member;

import java.util.List;

public interface MemberRepository {
    
    Member findById(Long id);

    List<Member> findAll();

    Member save(Member member);

    void deleteById(Long id);
}
