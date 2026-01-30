package com.green.board2.application;


import com.green.board2.application.model.Board2GetOneRes;
import com.green.board2.application.model.Board2GetRes;
import com.green.board2.application.model.Board2PostReq;
import com.green.board2.application.model.Board2PutReq;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Board2")
public class Board2Controller {
    private final Board2Service board2Service;

    @PostMapping
    public int postBoard(@RequestBody Board2PostReq req){
        int result = board2Service.postBoard(req);
        return result;
    }

    @GetMapping
    public List<Board2GetRes> getBoardList(){
        return board2Service.getBoardList();
    }
    @GetMapping("{id}")
    public Board2GetOneRes getBoardOne(@PathVariable int id ){
        return board2Service.getBoardOne(id);
    }

    @PutMapping
    public int putBoard(@RequestBody Board2PutReq req){
        return board2Service.putBoard(req);
    }

    @DeleteMapping
    public int delBoard(@RequestParam int id){
        return board2Service.delBoard(id);
    }






}
