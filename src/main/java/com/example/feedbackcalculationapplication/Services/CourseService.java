package com.example.feedbackcalculationapplication.Services;

import com.example.feedbackcalculationapplication.dbmodels.CourseEntity;
import com.example.feedbackcalculationapplication.models.CourseModel;
import com.example.feedbackcalculationapplication.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public CourseEntity course(CourseEntity course) {
        return courseRepository.save(course);
    }

    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    public CourseEntity updateCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

//    public void deleteCourse(Long courseId) {
//        courseRepository.deleteById(courseId);
//    }
}
