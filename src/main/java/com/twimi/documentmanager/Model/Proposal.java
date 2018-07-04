package com.twimi.documentmanager.Model;

import lombok.Data;

@Data
public class Proposal {
    private int pid;
    private String name;
    private int author;
    private int timeline;
    private int deadline;
    private int status;
    private int support;
    private int reject;
}
