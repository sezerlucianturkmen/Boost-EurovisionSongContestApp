package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name="tblsong")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Song extends Default{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column( length = 100)
    String name;
    @Column( length = 100)
    String genre;
    @Column( length = 1000)
    String lyrics;
    int onStage;


}
