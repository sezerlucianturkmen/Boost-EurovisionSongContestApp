package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConstestRepository extends JpaRepository<Contest,Long> {
}
