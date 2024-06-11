package com.example.feedbackcalculationapplication.dbmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "feedbackdb")
public class FeedBackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("feedbackId")
    private Long feedbackId;

    @JsonProperty("courseId")
    private Long courseId;
    @JsonProperty("relevance")
    private int relevance;
    @JsonProperty("clarity")
    private int clarity;
    @JsonProperty("confidence")
    private int confidence;
    @JsonProperty("trainerRating")
    private int trainerRating;
    @JsonProperty("enjoyment")
    private String enjoyment;
    @JsonProperty("comments")
    private String comments;

    @JsonProperty("finalFeedBackScore")
    private double finalFeedBackScore;

    public FeedBackEntity() {
    }

    public FeedBackEntity(Long feedbackId, Long courseId, int relevance, int clarity, int confidence, int trainerRating, String enjoyment, String comments, double finalFeedBackScore) {
        this.feedbackId = feedbackId;
        this.courseId = courseId;
        this.relevance = relevance;
        this.clarity = clarity;
        this.confidence = confidence;
        this.trainerRating = trainerRating;
        this.enjoyment = enjoyment;
        this.comments = comments;
        this.finalFeedBackScore = finalFeedBackScore;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public int getClarity() {
        return clarity;
    }

    public void setClarity(int clarity) {
        this.clarity = clarity;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public int getTrainerRating() {
        return trainerRating;
    }

    public void setTrainerRating(int trainerRating) {
        this.trainerRating = trainerRating;
    }

    public String getEnjoyment() {
        return enjoyment;
    }

    public void setEnjoyment(String enjoyment) {
        this.enjoyment = enjoyment;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getFinalFeedBackScore() {
        return finalFeedBackScore;
    }

    public void setFinalFeedBackScore(double finalFeedBackScore) {
        this.finalFeedBackScore = finalFeedBackScore;
    }
}
