package com.example.demo.controller;

import com.example.demo.dto.UserScoreDTO;
import com.example.demo.model.UserScoreEntity;
import com.example.demo.service.UserScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/score")
public class UserScoreController {

    @Autowired
    private UserScoreService userScoreService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public UserScoreEntity addScore(UserScoreDTO userScoreDTO)
    {
        return userScoreService.addScore(userScoreDTO);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public UserScoreEntity getScore(String id)
    {
        return userScoreService.getScore(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public UserScoreEntity updateScore(UserScoreDTO userScoreDTO)
    {
        return userScoreService.updateScore(userScoreDTO);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public void deleteScore(String id)
    {
         userScoreService.deleteScore(id);
    }
}
