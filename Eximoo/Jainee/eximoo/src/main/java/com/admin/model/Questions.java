package com.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="questions")
public class Questions {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	private long number;
	
	private int levelId;
	
	private String langageId;
 
    private String questionName;
 
    private String optionA;

    private String optionB;
  
    private String optionC;
  
    private String optionD;
  
    private String answer;
    
    private int isDeleted;
    
    private String addedBy;
    
    private String modifyBy;
    
    private String addedDate;
    
    private String modifyDate;
    
    
  
  
}
