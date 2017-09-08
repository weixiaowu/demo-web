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
@Table(name="demo_shopping")
public class ShoppingDo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@OrderBy("DESC")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long    shoppingId;  
	public Long    userId;   	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date    shoppingCreatedon;
	public Long getShoppingId() {
		return shoppingId;
	}
	public void setShoppingId(Long shoppingId) {
		this.shoppingId = shoppingId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getShoppingCreatedon() {
		return shoppingCreatedon;
	}
	public void setShoppingCreatedon(Date shoppingCreatedon) {
		this.shoppingCreatedon = shoppingCreatedon;
	}
	

	
}
