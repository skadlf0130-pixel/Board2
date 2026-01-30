package com.green.board2.application.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Board2PutReq {
    private int id;
    private String title;
    private String contents;
}
