package org.example.bliss_be.repository;

import org.example.bliss_be.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity,String> {
    Optional<MemberEntity> findByName(String name);
}
