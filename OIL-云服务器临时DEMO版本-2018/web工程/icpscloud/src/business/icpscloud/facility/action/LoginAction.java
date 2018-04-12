/**
 * 
 */
package business.icpscloud.facility.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import business.icpscloud.facility.entity.UserEntity;
import business.icpscloud.facility.service.MyService;

/**
 * @author LiPeiXu
 * @ModifyDate 2018��3��1��
 */
public class LoginAction extends ActionSupport {
	// ���������ڷ�װ�û������������������
		private String name;
		private String password;
		// ���ڷ�װ������������
		private String tip;
		// ϵͳ���õ�ҵ���߼����
		private MyService ms;

		// ����ע��ҵ���߼�����������setter����
		public void setMs(MyService ms) {
			this.ms = ms;
		}

		/**
		 * �û���¼
		 * 
		 * @return
		 * @throws Exception
		 */
		public String login() throws Exception {
			// ����ҵ���߼������valid������
			// ��֤�û�������û����������Ƿ���ȷ
			System.out.println(getName());
			System.out.println(getPassword());
			if (ms.valid(getName(), getPassword())) {
				System.out.println("�ɹ�");
				return SUCCESS;
			} else {
				System.out.println("ʧ��");
				return "error";
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getTip() {
			return tip;
		}

		public void setTip(String tip) {
			this.tip = tip;
		}

		public MyService getMs() {
			return ms;
		}
}
