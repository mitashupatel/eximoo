package com.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.model.Questions;
import com.admin.service.AddQuestionService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class AddQuestionController {
	
   @Autowired
   AddQuestionService addQuestionService;

   @Autowired
   HttpSession session;


 @RequestMapping(value="/addQuestion",method= {RequestMethod.POST})
 public String addQuestion(@ModelAttribute("question") Questions question) {
	
	long result = addQuestionService.saveUpdateQuestion(question);
	return "QuizSubmitted";
	
}
}
