package cn.jyc.demo.dao;

import org.springframework.stereotype.Repository;

import cn.jyc.demo.pojo.UserDo;
import tk.mybatis.mapper.common.Mapper;



/**   
* @Description: TODO
* @author weixw   
* @date 2017年9月8日 
* @since 1.0.0   
*/
@Repository
public interface UserMapper extends Mapper<UserDo>{

	

}
