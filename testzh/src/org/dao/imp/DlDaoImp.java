package org.dao.imp;
import java.util.List;
import org.dao.DlDao;
import org.model.Userinfo;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class DlDaoImp extends HibernateDaoSupport implements DlDao{
	public Userinfo find(String username,String userpassword) {
		String str[]={username,userpassword};
		List list=getHibernateTemplate().find("from Userinfo where username=? and userpassword=?",str);
		if(list.size()>0)
			return (Userinfo) list.get(0);
		else
			return null;
	}
	public void save(Userinfo user) {
		getHibernateTemplate().save(user);
	}
}