package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name="tblcontest")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder

public class Contest extends Default  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String city;
    String country;
    String concertArea;
    int capacity;
    LocalDate eventDate;

}
