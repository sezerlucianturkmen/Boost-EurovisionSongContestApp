package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.controller;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Participant;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.enums.ECountry;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import static com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.constants.EndPoint.*;

@RestController
@RequestMapping(PARTICIPANT)
@RequiredArgsConstructor
public class ParticipantController {
    private final ParticipantService participantService;


    @GetMapping(SAVE)
    public Participant saveParticipant(String representative, String eCountry, String firstParticipationYear, boolean isBigFive,Integer winningScore){
        Participant participant=Participant.builder()
                .representative(representative)
                .eCountry(ECountry.valueOf(eCountry))
                .firstParticipationYear(firstParticipationYear)
                .isBigFive(isBigFive)
                .winningScore(winningScore)
                .build();
        return participantService.save(participant);
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Participant>> findAll(){
        return ResponseEntity.ok(participantService.findAll());
    }

}
