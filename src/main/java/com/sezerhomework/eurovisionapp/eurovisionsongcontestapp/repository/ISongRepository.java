package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Participant;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongRepository extends JpaRepository<Song,Long> {
}
