package com.admin.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Questions;

public interface AddQuestionService {
	
	public long saveUpdateQuestion(Questions question);
	public Questions editQuestion(long id);
	public boolean deleteQuestion(long id);
	public List<Questions> getAll();
}
