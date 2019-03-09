package com.example.demo.service;

import com.example.demo.model.CommentaryEntity;
import com.example.demo.model.CommentaryMessageEntity;
import com.example.demo.model.MatchesResponse;

public interface CommentaryService {
    CommentaryMessageEntity getPredictionTrueOrFalse(String userName, String prediction);
    void saveCommentary(CommentaryEntity commentaryEntity);
    MatchesResponse liveMatches();

}
