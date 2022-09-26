package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Default {
    boolean isactive;
    Long createdate;
    Long updatedate;
}
