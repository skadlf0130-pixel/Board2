package com.green.board2.application;


import com.green.board2.application.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board2")
public class Board2Controller {
    private final Board2Service board2Service;

    @PostMapping
    public int postBoard(@RequestBody Board2PostReq req){
        int result = board2Service.postBoard2(req);
        return result;
    }

    @GetMapping
    public List<Board2GetRes> getBoard2List(){
        return board2Service.getBoard2List();
    }

    @GetMapping("{id}")
    public Board2GetOneRes getBoard2One(@PathVariable int id ){
        return board2Service.getBoard2One(id);
    }

    @PutMapping
    public int putBoard2(@RequestBody Board2PutReq req){
        return board2Service.putBoard2(req);
    }

    @DeleteMapping
    public int delBoard2(@RequestParam int id){
        return board2Service.delBoard2(id);
    }






}
