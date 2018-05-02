/**
 * 
 */
package business.icpscloud.facility.service.impl;

import business.icpscloud.facility.dao.PersonDao;
import business.icpscloud.facility.service.MyService;

/**
 * @author LiPeiXu
 * @ModifyDate 2018��3��1��
 */
public class MyServiceImpl implements MyService {
	private PersonDao personDao;

	/**
	 * У���û�������
	 * 
	 * @param name
	 *            �û���
	 * @param password
	 *            ����
	 * @return true:���ڣ�false:������
	 */
	public boolean valid(String name, String password) {
		System.out.println("ServiceImpl");
		return personDao.valid(name, password);
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
