package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Quiz;



@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
