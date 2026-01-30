package com.green.board2.application;

import com.green.board2.application.model.Board2GetOneRes;
import com.green.board2.application.model.Board2GetRes;
import com.green.board2.application.model.Board2PostReq;
import com.green.board2.application.model.Board2PutReq;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Board2Service {

    private final Board2Mapper board2Mapper;

    public int postBoard(Board2PostReq req){
       return board2Mapper.save(req);
    }
    public List<Board2GetRes> getBoardList(){
        return board2Mapper.findAll();

    }
    public Board2GetOneRes getBoardOne(int id){
        return board2Mapper.findById(id);
    }
    public  int putBoard(Board2PutReq req){
        return board2Mapper.update(req);
    }
    public  int delBoard(int id){
        return board2Mapper.delete(id);
    }
}
