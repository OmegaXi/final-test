package org.dao;
import org.model.Userinfo;
public interface DlDao {
	//ע���µ��û�
	public void save(Userinfo user);
	//����ѧ�źͿ������
	public Userinfo find(String username,String userpassword);
}
