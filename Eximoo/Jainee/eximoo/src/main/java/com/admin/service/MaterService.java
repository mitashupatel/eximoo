package com.admin.service;

import java.util.List;

import com.admin.model.Language;


public interface MaterService {
	public long saveMaster(Language mobj);
	public List<Language> getMaster();
}
