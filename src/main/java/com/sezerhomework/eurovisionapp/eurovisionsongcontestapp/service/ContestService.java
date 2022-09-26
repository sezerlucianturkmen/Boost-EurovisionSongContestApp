package com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.service;

import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.utility.ServiceManager;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.IConstestRepository;
import com.sezerhomework.eurovisionapp.eurovisionsongcontestapp.repository.entity.Contest;
import org.springframework.stereotype.Service;

@Service
public class ContestService extends ServiceManager<Contest,Long> {
    private final IConstestRepository contestRepository;
    public ContestService(IConstestRepository contestRepository){
        super(contestRepository);
        this.contestRepository=contestRepository;
    }
}
