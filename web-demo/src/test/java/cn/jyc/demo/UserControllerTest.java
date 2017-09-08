package cn.jyc.demo;

import org.junit.Test;

import cn.jyc.demo.pojo.UserDo;
import cn.jyc.demo.service.UserService;

/**   
* @Description: TODO
* @author weixw   
* @date 2017年9月8日 
* @since 1.0.0   
*/
public class UserControllerTest extends WebAppConfigureBase{
	
	
	@Test
	public void run1(){
		UserService bean = getWac().getBean(UserService.class);
		System.out.println(bean.select(new UserDo(), null));
	}

}
