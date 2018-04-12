/**
 * 
 */
package business.icpscloud.facility.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;


import business.icpscloud.facility.dao.PersonDao;
import business.icpscloud.facility.entity.Person;
import business.icpscloud.facility.entity.UserEntity;

/**
 * @author LiPeiXu
 * @ModifyDate 2018��3��1��
 */
public class PersonDaoImpl implements PersonDao {
	private HibernateTemplate ht = null;
	private SessionFactory sessionFactory;

	// ����ע��SessionFactory��setter����
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// ��ʼ��HibernateTemplate�ķ���
	private HibernateTemplate getHibernateTemplate() {
		if (ht == null) {
			ht = new HibernateTemplate(sessionFactory);
		}
		return ht;
	}

	/**
	 * У���û�������
	 * 
	 * @param name
	 *            �û���
	 * @param password
	 *            ����
	 * @return true:���ڣ�false:������
	 */
	@SuppressWarnings("unchecked")
	public boolean valid(String name, String password) {
		System.out.println("DaoImpl");
		//String hql="FROM UserEntity ue WHERE ue.userName= '"+ entity.getUserName() + "' AND ue.password= '" + Encrypt.e(entity.getPassword()) + "'" ;
		String hql = "from Person p where p.name='admin' and p.password='admin'";
		List<Person> list = this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

	
}
