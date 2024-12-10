package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Quiz;
import com.example.demo.service.QuizService;



@RestController
public class QuizController {
	@Autowired
	private QuizService service;
	
	@GetMapping("getQuizzes")
	public List<Quiz> getQuizzes(){
		return service.getQuizzes();
		
	}
	@GetMapping("getQuiz/{id}")
	public Quiz getQuizzeById(@PathVariable int id){
		return service.getQuizzeById(id);
		
	}
	@PostMapping("getQuiz")
	public Quiz addQuiz(@RequestBody Quiz quiz){
		return service.addQuiz(quiz);
	}
	@PutMapping("getQuiz")
	public Quiz updateQuiz(@RequestBody Quiz quiz){
		return service.updateQuiz(quiz);
	}
	@DeleteMapping("getquiz/{id}")
	public void deleteQuizById(@PathVariable int id){
		service.deleteQuizById(id);
	}
}
