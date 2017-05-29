package org.dao;
import org.model.Userinfo;
public interface DlDao {
	//注册新的用户
	public void save(Userinfo user);
	//根据学号和口令查找
	public Userinfo find(String username,String userpassword);
}
