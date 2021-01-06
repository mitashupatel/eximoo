package com.admin.dao;

import java.util.List;

import com.admin.model.Language;

public interface MasterDao {
	public long saveMaster(Language mobj);
	public List<Language> getMaster();
}
