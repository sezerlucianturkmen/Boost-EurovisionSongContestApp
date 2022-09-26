package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParticipantRepository extends JpaRepository<Participant,Long> {
}
