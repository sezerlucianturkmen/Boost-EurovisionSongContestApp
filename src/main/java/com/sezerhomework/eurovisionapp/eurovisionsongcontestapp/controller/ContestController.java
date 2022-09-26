package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.controller;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Contest;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service.ContestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import static com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.constants.EndPoint.*;

@RestController
@RequestMapping(CONTEST)
@RequiredArgsConstructor
public class ContestController {
    private final ContestService contestService;


    @GetMapping(SAVE)
    public Contest saveContest( String city, String country, String concertArea, Integer capacity, String eventDate){
        Contest contest=Contest.builder()
                .city(city)
                .country(country)
                .concertArea(concertArea)
                .capacity(capacity)
                .eventDate(LocalDate.parse(eventDate))
                .build();
        return contestService.save(contest);
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Contest>> findAll(){
        return ResponseEntity.ok(contestService.findAll());
    }

}
