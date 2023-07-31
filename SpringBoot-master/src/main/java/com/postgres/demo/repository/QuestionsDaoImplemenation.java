package com.postgres.demo.repository;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.postgres.demo.model.Question;

@Repository
public class QuestionsDaoImplemenation implements IQuestionDao{

	@Override
	public List<Question> fetchQuestionsDao(SessionFactory session) {
		return session.getCurrentSession().createQuery("From Question").list();
	}

	@Override
	public Question saveQuestionsDao(@Valid Question question,SessionFactory session) {
		session.getCurrentSession().saveOrUpdate(question);
		return question;
	}

}
