/**
 * 
 */
package business.icpscloud.facility.entity;

/**
 * @author LiPeiXu
 * @ModifyDate 2018��3��1��
 */
public class UserEntity {
	private  String Id;
	 private String Name;
     private String Pass;
     
	public UserEntity(String id, String name, String pass) {
		Id = id;
		Name = name;
		Pass = pass;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}         
}
