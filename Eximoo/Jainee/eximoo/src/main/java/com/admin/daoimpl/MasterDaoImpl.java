package com.admin.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.dao.MasterDao;
import com.admin.model.Language;
import com.admin.model.User;
 

@Repository("masterDao")
public class MasterDaoImpl extends GenericDaoImpl<Language> implements MasterDao{
	protected static SessionFactory sessionFactory;
	
	public long saveMaster(Language mobj) {
		return super.saveUpdateObject(mobj).getLanguageId();
	}

	public List<Language> getMaster() {
		return (List<Language>) super.getByQuery("FROM Language a WHERE isDeleted=0");
	}

}
