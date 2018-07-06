package com.twimi.documentmanager.Service;

import com.twimi.documentmanager.Model.Proposal;

import java.util.List;

public interface ProposalService {

    Proposal getProposalByPid(int pid);

    List<Proposal> getAll();

    List<Proposal> getProposalsByUid(int uid);

    List<Proposal> getProposalsByName(String name);

    int add(int uid, String name, String content);
}
