package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.MasterDao;
import com.admin.model.Language;
import com.admin.service.MaterService;


@Service("masterService")
public class MasterServiceImpl implements MaterService {
    
	@Autowired
	MasterDao masterDao;
	public long saveMaster(Language mobj) {
		long laguageid = 0;
		masterDao.saveMaster(mobj);

		return laguageid;
	}

	public List<Language> getMaster() {
		return masterDao.getMaster();
	}

	}


