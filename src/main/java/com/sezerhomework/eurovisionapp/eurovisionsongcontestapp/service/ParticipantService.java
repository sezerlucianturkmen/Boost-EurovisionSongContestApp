package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.utility.ServiceManager;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.IParticipantRepository;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Participant;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService extends ServiceManager<Participant,Long> {
    private final IParticipantRepository participantRepository;
    public  ParticipantService(IParticipantRepository participantRepository){
        super(participantRepository);
        this.participantRepository=participantRepository;
    }
}
