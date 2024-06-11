package com.example.feedbackcalculationapplication.models;

public class FeedBackModel {
    private int relevance;
    private int clarity;
    private int confidence;
    private int trainerRating;
    private String enjoyment;
    private String comments;
    private double finalFeedbackScore;

    public FeedBackModel() {
    }

    public FeedBackModel(int relevance, int clarity, int confidence, int trainerRating, String enjoyment, String comments,double finalFeedbackScore) {
        this.relevance = relevance;
        this.clarity = clarity;
        this.confidence = confidence;
        this.trainerRating = trainerRating;
        this.enjoyment = enjoyment;
        this.comments = comments;
        this.finalFeedbackScore = finalFeedbackScore;
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

    public double getFinalFeedbackScore() {
        return finalFeedbackScore;
    }

    public void setFinalFeedbackScore(double finalFeedbackScore) {
        this.finalFeedbackScore = finalFeedbackScore;
    }
}

