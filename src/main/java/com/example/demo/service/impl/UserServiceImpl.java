package com.example.demo.service.impl;

import com.example.demo.dto.UserScoreDTO;
import com.example.demo.model.UserScoreEntity;
import com.example.demo.repository.UserScoreRepository;
import com.example.demo.service.UserScoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserScoreService {

    @Autowired
    private UserScoreRepository userScoreRepository;

    @Override
    public UserScoreEntity addScore(UserScoreDTO userScoreDTO) {
        UserScoreEntity userScoreEntity=new UserScoreEntity();
        BeanUtils.copyProperties(userScoreDTO,userScoreEntity);
        userScoreRepository.save(userScoreEntity);
        return userScoreEntity;
    }

    @Override
    public UserScoreEntity getScore(String id) {
        UserScoreEntity userScoreEntity=userScoreRepository.findOne(id);
        return userScoreEntity;
    }

    @Override
    public UserScoreEntity updateScore(UserScoreDTO userScoreDTO) {
        UserScoreEntity userScoreEntity=new UserScoreEntity();
        BeanUtils.copyProperties(userScoreDTO,userScoreEntity);
        userScoreRepository.save(userScoreEntity);
        return null;
    }

    @Override
    public void deleteScore(String id) {
        userScoreRepository.delete(id);
    }
}
