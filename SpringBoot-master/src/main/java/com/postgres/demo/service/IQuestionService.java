package com.postgres.demo.service;

import java.util.List;

import javax.validation.Valid;

import com.postgres.demo.model.Question;

public interface IQuestionService {
	
	List<Question> fetchQuestionslist();

	Question saveQuestion(@Valid Question question);

}
