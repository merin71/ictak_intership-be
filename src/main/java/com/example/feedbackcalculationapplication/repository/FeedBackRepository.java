package com.example.feedbackcalculationapplication.repository;

import com.example.feedbackcalculationapplication.dbmodels.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedBackRepository extends JpaRepository<FeedBackEntity, Long> {

}
