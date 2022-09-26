package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.controller;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Song;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.constants.EndPoint.*;

@RestController
@RequestMapping(SONG)
@RequiredArgsConstructor
public class SongController {
    private final SongService songService;


    @GetMapping(SAVE)
    public Song saveSong(String name, String genre, String lyrics, Integer onStage){
        Song song=Song.builder()
                .name(name)
                .genre(genre)
                .lyrics(lyrics)
                .onStage(onStage)
                .build();
        return songService.save(song);
    }    

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Song>> findAll(){
        return ResponseEntity.ok(songService.findAll());
    }

}
