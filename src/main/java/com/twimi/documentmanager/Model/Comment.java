package com.twimi.documentmanager.Model;

import lombok.Data;

@Data
public class Comment {
    private int cid;
    private int uid;
	private String content;
    private int timeline;
}
