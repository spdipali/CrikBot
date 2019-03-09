package com.example.demo.controller;

import com.example.demo.dto.UserScoreDTO;
import com.example.demo.model.*;
import com.example.demo.service.CommentaryService;
import com.example.demo.service.UserScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/score")
public class UserScoreController {


    @Autowired
    CommentaryService commentaryService;

    @RequestMapping(value = "/liveMatchesList")
    public MatchesResponse liveMatchesList(){
        return commentaryService.liveMatches();
    }

    @RequestMapping(value = "/checkingPrediction")
    public CommentaryMessageEntity checkingPredictionTrueOrFalse(@RequestParam String userName, @RequestParam String prediction){

        CommentaryMessageEntity commentaryMessageEntity=new CommentaryMessageEntity();
        commentaryMessageEntity=commentaryService.getPredictionTrueOrFalse(userName,prediction);
        return commentaryMessageEntity;
    }



    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public Response getAnswer1(){
        System.out.println("Hi");

        data newData = new data();
        newData.setText("Hiiii Hello");
        newData.setType("text");
        Response response = new Response();
        response.setData(newData);
        return response;
    }


}
