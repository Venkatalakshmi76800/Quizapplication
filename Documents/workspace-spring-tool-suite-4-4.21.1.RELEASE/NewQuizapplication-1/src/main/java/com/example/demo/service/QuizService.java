package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Quiz;
import com.example.demo.repository.QuizRepository;



@Service
public class QuizService {
	@Autowired
	private QuizRepository repo;
	
	public List<Quiz> getQuizzes(){
		return repo.findAll();
		
	}
	public Quiz getQuizzeById(int id){
		return repo.findById(id).orElse(new Quiz());
		
	}
	
	public Quiz addQuiz(Quiz quiz){
		return repo.save(quiz);
	}
	
	public Quiz updateQuiz(Quiz quiz){
		return repo.save(quiz);
	}
	
	public void deleteQuizById(int id){
		repo.deleteById(id);
	}

}
