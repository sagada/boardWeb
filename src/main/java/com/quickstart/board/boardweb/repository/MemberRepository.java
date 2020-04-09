package com.quickstart.board.boardweb.repository;

import com.quickstart.board.boardweb.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
}
