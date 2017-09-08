package cn.jyc.demo.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**   
* @Description: TODO
* @author weixw   
* @date 2017年9月8日 
* @since 1.0.0   
*/
@Table(name="demo_user")
public class UserDo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@OrderBy("DESC")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long    userId;   	
	public String  userCode;            
	public String  userName; 
	public String  userPassword;	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date    userCreatedon;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getUserCreatedon() {
		return userCreatedon;
	}
	public void setUserCreatedon(Date userCreatedon) {
		this.userCreatedon = userCreatedon;
	}
	@Override
	public String toString() {
		return "UserDo [userId=" + userId + ", userCode=" + userCode + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userCreatedon=" + userCreatedon + "]";
	}  	
	
	
}
