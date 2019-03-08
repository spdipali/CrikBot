package com.example.demo.service;

import com.example.demo.dto.UserScoreDTO;
import com.example.demo.model.UserScoreEntity;

public interface UserScoreService{

    UserScoreEntity addScore(UserScoreDTO userScoreDTO);
    UserScoreEntity getScore(String id);
    UserScoreEntity updateScore(UserScoreDTO userScoreDTO);
    void deleteScore(String id);

}
