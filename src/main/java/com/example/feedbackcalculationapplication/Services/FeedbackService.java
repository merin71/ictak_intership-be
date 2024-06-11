package com.example.feedbackcalculationapplication.Services;

import com.example.feedbackcalculationapplication.dbmodels.FeedBackEntity;
import com.example.feedbackcalculationapplication.repository.FeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedBackRepository feedbackRepository;

    public FeedBackEntity saveFeedback(FeedBackEntity feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<FeedBackEntity> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}
