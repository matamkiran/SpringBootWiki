package com.postgres.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.demo.exception.ResourceNotFoundException;
import com.postgres.demo.model.Question;
import com.postgres.demo.service.IQuestionService;

@RestController
public class QController {
	
	@Autowired
	private IQuestionService iQuestionService;
	
	@GetMapping("/my/questions")
    public List<Question> getQuestions() throws ResourceNotFoundException {
		return iQuestionService.fetchQuestionslist();
    }
	
	@PostMapping("/my/question/save")
    public Question createQuestion(@RequestHeader(name = "X-Trace-Id") String transid ,@RequestBody Question question) {
		return iQuestionService.saveQuestion(question);
    }

}
