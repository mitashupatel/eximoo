package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.AddQuestionDao;
import com.admin.model.Admin;
import com.admin.model.Questions;

@Repository("addQuestionDao")
public class AddQustionDaoImpl extends GenericDaoImpl<Questions> implements AddQuestionDao {

	

	public long saveUpdateQuestion(Questions question) {
		return super.saveUpdateObject(question).getId();
		
	}

	public Questions editQuestion(long id) {
		return super.getById(Questions.class, id);
	}

	public boolean deleteQuestion(long id) {
		Questions question = super.getById(Questions.class, id);
		question.setIsDeleted(1);
		return super.updateObject(question).getId()> 0;
	}

	public List<Questions> getAll() {
		return (List<Questions>) super.getByQuery("FROM Questions a WHERE isDeleted=0");
	}
}
