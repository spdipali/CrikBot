package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class CommentaryMessageEntity {


    private CommentaryEntity commentaryEntity;
    private String message;

    public CommentaryEntity getCommentaryEntity() {
        return commentaryEntity;
    }

    public void setCommentaryEntity(CommentaryEntity commentaryEntity) {
        this.commentaryEntity = commentaryEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
