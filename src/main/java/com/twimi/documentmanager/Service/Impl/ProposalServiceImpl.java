package com.twimi.documentmanager.Service.Impl;

import com.twimi.documentmanager.Dao.ProposalDao;
import com.twimi.documentmanager.Model.Proposal;
import com.twimi.documentmanager.Service.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalServiceImpl implements ProposalService {

    @Autowired
    ProposalDao proposalDao;

    @Override
    public Proposal getProposalByPid(int pid) {
        return proposalDao.geyProposalByPid(pid);
    }

    @Override
    public List<Proposal> getAll() {
        return proposalDao.getAll();
    }

    @Override
    public List<Proposal> getProposalsByUid(int uid) {
        return proposalDao.getProposalsByUid(uid);
    }

    @Override
    public List<Proposal> getProposalsByName(String name) {
        return proposalDao.getProposalsByName(name);
    }

    @Override
    public int add(int uid, String name, String content) {
        Proposal proposal = new Proposal(uid, name, content);
        if (proposalDao.insert(proposal) > 0) {
            return proposal.getPid();
        } else {
            return -1;
        }
    }
}
