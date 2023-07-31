package com.postgres.demo.repository;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.SessionFactory;

import com.postgres.demo.model.Question;

public interface IQuestionDao {
	
	List<Question> fetchQuestionsDao(SessionFactory session);

	Question saveQuestionsDao(@Valid Question question, SessionFactory session);

}
