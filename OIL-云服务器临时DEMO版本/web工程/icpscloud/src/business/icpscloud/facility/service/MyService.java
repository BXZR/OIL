/**
 * 
 */
package business.icpscloud.facility.service;

/**
 * @author LiPeiXu
 * @ModifyDate 2018��3��1��
 */
public interface MyService {
	/**
	 * У���û�������
	 * 
	 * @param name
	 *            �û���
	 * @param password
	 *            ����
	 * @return true:���ڣ�false:������
	 */
	boolean valid(String name, String password);
}
