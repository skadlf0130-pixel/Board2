package com.green.board2.application.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Board2GetRes {
    private int id;
    private String title;
    private String createdAt;
}
