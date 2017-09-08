package cn.jyc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.jyc.demo.dao.UserMapper;
import cn.jyc.demo.pojo.UserDo;

/**   
* @Description: TODO
* @author weixw   
* @date 2017年9月8日 
* @since 1.0.0   
*/
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	
	public List<UserDo> select(UserDo user, Integer[] page){
    	if(page != null && page.length > 0){
    		PageHelper.startPage(page[0], page.length>1&&page[1]!=null?page[1]:20);
    	}
  
		return userMapper.select(user);
	}

}
