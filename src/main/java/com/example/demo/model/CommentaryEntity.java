package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Commentary")
public class CommentaryEntity {

    @Id
    private String id;
    private String runs;
    private float over;
    private String commentary;

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public float getOver() {
        return over;
    }

    public void setOver(float over) {
        this.over = over;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
