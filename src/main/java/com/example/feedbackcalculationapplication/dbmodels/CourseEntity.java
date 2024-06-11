package com.example.feedbackcalculationapplication.dbmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "coursedb")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("corseId")
    private Long courseId;
    @JsonProperty("courseName")
    private String courseName;

    @Enumerated(EnumType.STRING)
    @JsonProperty("ou")
    private OU ou;
    @Enumerated(EnumType.STRING)
    @JsonProperty("typeOfTraining")
    private TypeOfTraining typeOfTraining;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("batchCount")
    private int batchCount;
    @JsonProperty("trainerName")
    private String trainerName;
    @Enumerated(EnumType.STRING)
    @JsonProperty("status")
    private Status status;
    @JsonProperty("finalFeedback")
    private double finalFeedback;

    public enum OU {
        Academic, Corporate, Retail, Government
    }

    public enum TypeOfTraining {
        LTT, MDT, Microskill
    }

    public enum Status {
        Upcoming, Ongoing, Completed, Cancelled, Hold
    }


    public CourseEntity() {
    }



    public CourseEntity(Long courseId, String courseName, OU ou, TypeOfTraining typeOfTraining, Date startDate, Date endDate, int batchCount, String trainerName, Status status, double finalFeedback) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.ou = ou;
        this.typeOfTraining = typeOfTraining;
        this.startDate = startDate;
        this.endDate = endDate;
        this.batchCount = batchCount;
        this.trainerName = trainerName;
        this.status = status;
        this.finalFeedback = finalFeedback;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public OU getOu() {
        return ou;
    }

    public void setOu(OU ou) {
        this.ou = ou;
    }

    public TypeOfTraining getTypeOfTraining() {
        return typeOfTraining;
    }

    public void setTypeOfTraining(TypeOfTraining typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(int batchCount) {
        this.batchCount = batchCount;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getFinalFeedback() {
        return finalFeedback;
    }

    public void setFinalFeedback(double finalFeedback) {
        this.finalFeedback = finalFeedback;
    }
}
