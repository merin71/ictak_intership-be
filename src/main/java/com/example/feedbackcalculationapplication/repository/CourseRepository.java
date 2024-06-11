package com.example.feedbackcalculationapplication.repository;

import com.example.feedbackcalculationapplication.dbmodels.CourseEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
