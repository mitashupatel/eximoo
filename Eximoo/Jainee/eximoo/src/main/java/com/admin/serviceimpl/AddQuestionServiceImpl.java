package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.admin.dao.AddQuestionDao;
import com.admin.model.Admin;
import com.admin.model.Questions;
import com.admin.service.AddQuestionService;

@Service("addQuestionService")
public class AddQuestionServiceImpl implements AddQuestionService {
     @Autowired
     AddQuestionDao addQuestionDao;
	public long saveUpdateQuestion(Questions question) {
		long id=0;
	return id=addQuestionDao.saveUpdateQuestion(question);
		
		
	}
	public Questions editQuestion(long id) {
		return addQuestionDao.editQuestion(id);
	}
	public boolean deleteQuestion(long id) {
		return addQuestionDao.deleteQuestion(id);
	}
	public List<Questions> getAll() {
		List<Questions> questionList = addQuestionDao.getAll();
		
		return questionList;
	}

}
