package com.example.feedbackcalculationapplication.repository;

import com.example.feedbackcalculationapplication.dbmodels.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query(value = "SELECT * FROM users WHERE email=?1  and password=?2 ",nativeQuery = true)
    UserEntity login(String email, String password);
    @Query(value = "SELECT * FROM users WHERE email=?1", nativeQuery = true)
    UserEntity emailExists(String email);

//    @Query(value = "SELECT * FROM users WHERE id=?1", nativeQuery = true)
//    UserEntity getByUserId(int userId);

}
