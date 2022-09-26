package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.utility.ServiceManager;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.ISongRepository;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Song;
import org.springframework.stereotype.Service;

@Service
public class SongService extends ServiceManager<Song,Long> {
    private final ISongRepository songRepository;
    public SongService(ISongRepository songRepository){
        super(songRepository);
        this.songRepository=songRepository;
    }
}
