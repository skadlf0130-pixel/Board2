package com.green.board2.application;


import com.green.board2.application.model.Board2GetOneRes;
import com.green.board2.application.model.Board2GetRes;
import com.green.board2.application.model.Board2PostReq;
import com.green.board2.application.model.Board2PutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Board2Mapper {
    int save (Board2PostReq req);
    List<Board2GetRes> findAll();
    Board2GetOneRes findById(int id);
    int update(Board2PutReq req);
    int delete (int id);
}
