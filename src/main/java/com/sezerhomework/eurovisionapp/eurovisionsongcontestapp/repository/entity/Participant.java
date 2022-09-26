package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.enums.ECountry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



import javax.persistence.*;

@Table(name="tblparticipant")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Participant extends Default {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column( length = 100)
    String representative;
    @Enumerated(EnumType.STRING)
    ECountry eCountry;
    String firstParticipationYear;
    boolean isBigFive;
    int winningScore;
    @OneToOne
    @JoinColumn(name = "song_id")
    Song song;
    @ManyToOne
    @JoinColumn(name = "contest_id")
    Contest contest;


}
