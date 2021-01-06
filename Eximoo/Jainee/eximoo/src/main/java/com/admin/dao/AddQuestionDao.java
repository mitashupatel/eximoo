package com.admin.dao;

import java.util.List;

import com.admin.model.Questions;


public interface AddQuestionDao extends GenericDAO<Questions>{
	public long saveUpdateQuestion(Questions question) ;
    
	public Questions editQuestion(long id);
	
	public boolean deleteQuestion(long id);
	
	public List<Questions> getAll();
}
