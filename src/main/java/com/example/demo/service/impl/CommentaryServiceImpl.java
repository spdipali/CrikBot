package com.example.demo.service.impl;

import com.example.demo.model.CommentaryEntity;
import com.example.demo.model.CommentaryMessageEntity;
import com.example.demo.model.MatchesResponse;
import com.example.demo.repository.CommentaryRepository;
import com.example.demo.service.CommentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommentaryServiceImpl implements CommentaryService {

    @Autowired
    private CommentaryRepository commentaryRepository;


    @Override
    public CommentaryMessageEntity getPredictionTrueOrFalse(String userName, String prediction) {

        CommentaryMessageEntity commentaryMessageEntity=new CommentaryMessageEntity();
        CommentaryEntity commentaryEntity;

        final String uri = "http://localhost:8080/springrestexample/employees.xml";
        RestTemplate restTemplate = new RestTemplate();
        commentaryEntity=restTemplate.getForObject(uri, CommentaryEntity.class);

        if(commentaryEntity.getRuns().equalsIgnoreCase(prediction)){

            commentaryMessageEntity.setMessage("Prediction is correct");
        }
        else{
            commentaryMessageEntity.setMessage("Prediction is incorrect");
        }

        commentaryMessageEntity.setCommentaryEntity(commentaryEntity);
        return commentaryMessageEntity;

    }

    @Override
    public void saveCommentary(CommentaryEntity commentaryEntity) {
        commentaryRepository.save(commentaryEntity);
    }

    @Override
    public MatchesResponse liveMatches() {

        MatchesResponse listOfMatches= new MatchesResponse();

        final String uri = "http://localhost:8080/springrestexample/employees.xml";
        RestTemplate restTemplate = new RestTemplate();

        listOfMatches=restTemplate.getForObject(uri,MatchesResponse.class);

        return listOfMatches;
    }
}
