package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.utility;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.IParticipantRepository;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.ISongRepository;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.IConstestRepository;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Contest;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Participant;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Song;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.enums.ECountry;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service.ContestService;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service.ParticipantService;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DefaultDataImpl {

    private final ParticipantService participantService;
    private final SongService songService;
    private final ContestService contestService;
    @PostConstruct
    private void create(){
        saveImpl();


    }
    private void saveImpl() {

        Contest contest=Contest.builder()
                .city("Milano")
                .country("Italy")
                .concertArea("Il Grande")
                .capacity(1_000_000)
                .eventDate(LocalDate.parse("2024-06-10"))
                .build();

        contestService.save(contest);

        Song song1 = Song.builder()
                .name("Martilar")
                .genre("Pop")
                .lyrics("Uzulecek o martilar...")
                .onStage(6)
                .build();
        Song song2 = Song.builder()
                .name("Easy on Me")
                .genre("Slow")
                .lyrics("So go easy on me, I had good intention...")
                .onStage(1)
                .build();
        Song song3 = Song.builder()
                .name("Brividi")
                .genre("Hip Hop")
                .lyrics("Ho sognato di volare con te...")
                .onStage(3)
                .build();
        Song song4 = Song.builder()
                .name("Papaoutai")
                .genre("Pop")
                .lyrics("Dites-moi d'ou il vient...")
                .onStage(4)
                .build();
        Song song5 = Song.builder()
                .name("Slo-Mo")
                .genre("R&B")
                .lyrics("El mundo esta loco con este party...")
                .onStage(6)
                .build();
        Song song6 = Song.builder()
                .name("satelite")
                .genre("Pop")
                .lyrics("I'm in orbit all the way around you...")
                .onStage(1)
                .build();

        Participant participant1 = Participant.builder()
                .representative("EDIS")
                .eCountry(ECountry.TURKEY)
                .firstParticipationYear("1980")
                .isBigFive(false)
                .winningScore(1)
                .song(song1)
                .contest(contest)
                .build();
        Participant participant2 = Participant.builder()
                .representative("ADELE")
                .eCountry(ECountry.ENGLAND)
                .firstParticipationYear("1963")
                .isBigFive(true)
                .winningScore(4)
                .song(song2)
                .contest(contest)
                .build();
        Participant participant3 = Participant.builder()
                .representative("MAHMOOD")
                .eCountry(ECountry.ITALY)
                .firstParticipationYear("1965")
                .isBigFive(true)
                .winningScore(3)
                .song(song3)
                .contest(contest)
                .build();
        Participant participant4 = Participant.builder()
                .representative("STROME")
                .eCountry(ECountry.FRANCE)
                .firstParticipationYear("1962")
                .isBigFive(true)
                .winningScore(2)
                .song(song4)
                .contest(contest)
                .build();
        Participant participant5 = Participant.builder()
                .representative("CHANEL")
                .eCountry(ECountry.SPAIN)
                .firstParticipationYear("1967")
                .isBigFive(true)
                .winningScore(6)
                .song(song5)
                .contest(contest)
                .build();
        Participant participant6 = Participant.builder()
                .representative("LENA")
                .eCountry(ECountry.GERMANY)
                .firstParticipationYear("1980")
                .isBigFive(false)
                .winningScore(1)
                .song(song6)
                .contest(contest)
                .build();


        songService.saveAll(Arrays.asList(song1, song2, song3, song4, song5, song6));
        participantService.saveAll(Arrays.asList(participant1,participant2,participant3,participant4,participant5,participant6));

    }
}
