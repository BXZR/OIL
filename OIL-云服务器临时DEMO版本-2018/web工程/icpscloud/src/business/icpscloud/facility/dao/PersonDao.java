/**
 * 
 */
package business.icpscloud.facility.dao;

import java.util.List;

import business.icpscloud.facility.entity.Person;

/**
 * @author LiPeiXu
 * @ModifyDate 2018��3��1��
 */
public interface PersonDao {
	/**
	 * У���û�������
	 * 
	 * @param name
	 *            �û���
	 * @param password
	 *            ����
	 * @return true:���ڣ�false:������
	 */
	public boolean valid(String name, String password);
}
