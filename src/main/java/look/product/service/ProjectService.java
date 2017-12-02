package look.product.service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProjectService {
	Map<String,Object> findPageObjects(@Param("keyword")String keyword,@Param("pageCurrent")Integer pageCurrent);
	
}
